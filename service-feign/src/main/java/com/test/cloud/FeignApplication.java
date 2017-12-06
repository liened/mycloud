package com.test.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * lesson3: feign http://blog.csdn.net/forezp/article/details/69808079
 * 	1.基于接口的注解（@FeignClien("服务名")）
 * 	2.实现了Ribbon负载均衡
 * 	lesson4: hystrix http://blog.csdn.net/forezp/article/details/69934399
 * 	 	Feign是自带断路器的，在D版本的spring cloud中默认没有打开，需要在配置文件中配置打开：
 * 	 		feign.hystrix.enabled=true
 * 	 	Hystrix Dashboard断路器仪表盘
 * 	 	例子基于service-ribbon改造，Feign的改造也一样
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignApplication.class, args);
	}
}
