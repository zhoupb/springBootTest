package com.example.springbootdemo;

import com.example.springbootdemo.domain.ConfigBean;
import com.example.springbootdemo.domain.ConfigBeanTest;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import javassist.CodeConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

@SpringBootApplication
@EnableConfigurationProperties({ConfigBeanTest.class})
public class SpringbootdemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootdemoApplication.class, args);

	}
}
