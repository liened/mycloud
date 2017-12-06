package com.test.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;
/**
 *  lesson 9 :  服务链路追踪(Spring Cloud Sleuth) http://blog.csdn.net/forezp/article/details/70162074
 *	  这篇文章主要讲述服务追踪组件zipkin，Spring Cloud Sleuth集成了zipkin组件。
 *	  【【 好像不稳定的样子】】
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinApplication.class, args);
	}
}
