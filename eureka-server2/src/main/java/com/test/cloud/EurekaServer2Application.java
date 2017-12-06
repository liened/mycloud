package com.test.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *  lesson7: 分布式配置中心 http://blog.csdn.net/forezp/article/details/70037513
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer2Application.class, args);
	}
}
