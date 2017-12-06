package com.test.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  lesson 6: 分布式配置中心 spring-cloud-config client http://blog.csdn.net/forezp/article/details/70037291
 *  lesson 7:
 *  lesson 8: Spring Cloud Bus http://blog.csdn.net/forezp/article/details/70148235
 */

@SpringBootApplication
@RestController
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@Value("${foo}")
	String foo;

	@RequestMapping(value="/hi")
	public String hi(){
		return foo;
	}
}
