package com.example.dora;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan({"com.example.dora.mapper"})
@EnableTransactionManagement
public class SpringbootdemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootdemoApplication.class, args);

	}
}
