package com.common.lcworld;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.common.lcworld.mapper*")
@ComponentScan(basePackages={"com.common"})
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class Application {


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
