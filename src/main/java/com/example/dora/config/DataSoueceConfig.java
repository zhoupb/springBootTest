package com.example.dora.config;

import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: zhoupb
 * @Description: DataSoueceConfig
 * @since: version 1.0
 */
@Configuration
@EnableTransactionManagement
@Slf4j
public class DataSoueceConfig {

    @Value("${spring.datasource.primary.type}")
    private Class<? extends DataSource> meType;

    @Value("${spring.datasource.secondary.type}")
    private Class<? extends DataSource> jiangType;

    @Bean(name = "zhoupb")
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    public DataSource getDataSource(){
        log.info("配置me数据源start");
        DataSource build = DataSourceBuilder.create().type(meType).build();
        log.info("配置me数据源end");
        return build;
    }
    @Bean(name = "zpb")
    @ConfigurationProperties(prefix="spring.datasource.secondary")
    public DataSource secondaryDataSource() {
        log.info("配置jiang数据源");
        return DataSourceBuilder.create().type(jiangType).build();
    }

    /**
     * 动态数据源配置
     * @return
     */
    @Bean
    @Primary
    public DataSource multipleDataSource(@Qualifier("zhoupb") DataSource zhoupb, @Qualifier("zpb") DataSource zpb) {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        Map< Object, Object > targetDataSources = new HashMap<>(4);
        targetDataSources.put(DataSourceName.ZHOUPB.getValue(), zhoupb);
        targetDataSources.put(DataSourceName.JIANG.getValue(), zpb);
        //添加数据源
        dynamicDataSource.setTargetDataSources(targetDataSources);
        //设置默认数据源
        dynamicDataSource.setDefaultTargetDataSource(zhoupb);
        return dynamicDataSource;
    }


    @Bean("sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(multipleDataSource(getDataSource(),secondaryDataSource()));

        MybatisConfiguration configuration = new MybatisConfiguration();
        configuration.setJdbcTypeForNull(JdbcType.NULL);
        configuration.setMapUnderscoreToCamelCase(true);
        configuration.setCacheEnabled(false);
        sqlSessionFactory.setConfiguration(configuration);
//        ClassPathResource resource = new ClassPathResource("/mapper/MallProductDataMapper.xml");
//        sqlSessionFactory.setMapperLocations(new Resource[]{resource});
//        sqlSessionFactory.setPlugins(new Interceptor[]{
//                paginationInterceptor()
//        });
        sqlSessionFactory.setGlobalConfig(globalConfig());
        return sqlSessionFactory.getObject();
    }

    public GlobalConfig globalConfig(){
        GlobalConfig globalConfig = new GlobalConfig();
        GlobalConfig.DbConfig dbConfig = new GlobalConfig.DbConfig();
        dbConfig.setTablePrefix("tbl_");
        globalConfig.setDbConfig(dbConfig);
        return globalConfig;
    }

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // 开启 PageHelper 的支持
        return paginationInterceptor;
    }


}
