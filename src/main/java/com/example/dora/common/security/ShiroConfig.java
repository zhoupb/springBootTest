package com.example.dora.common.security;

import com.example.dora.common.exception.MyExceptionHandler;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;

/**
 * @author: zhoupb
 * @Description: ShiroConfig
 * @since: version 1.0
 */
@Configuration
public class ShiroConfig {

//    /**
//     * 开启shiro aop注解支持.  (aop可以实现权限控制)
//     * 使用代理方式;所以需要开启代码支持;
//     *
//     * @param securityManager
//     * @return
//     */
////    @Bean
////    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
////        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
////        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
////        return authorizationAttributeSourceAdvisor;
////    }
//
//    @Bean
//    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator(){
//        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
//        advisorAutoProxyCreator.setProxyTargetClass(true);
//        return advisorAutoProxyCreator;
//    }
//
//    /**
//     * Spring容器中注册异常处理类，实现全局异常处理
//     *
//     * @return
//     */
//    @Bean(name = "exceptionHandler")
//    public HandlerExceptionResolver handlerExceptionResolver() {
//        return new MyExceptionHandler();
//    }
}
