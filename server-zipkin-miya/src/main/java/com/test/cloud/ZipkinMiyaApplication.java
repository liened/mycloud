package com.test.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

@SpringBootApplication
@RestController
public class ZipkinMiyaApplication {

	private static final Logger LOG = Logger.getLogger(ZipkinMiyaApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(ZipkinMiyaApplication.class, args);
	}

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	RestTemplate restTemplate(){
		return  new RestTemplate();
	}


	@RequestMapping("/hi")
	public String home(){
		LOG.log(Level.INFO," 【miya】 的 hi 方法被调用了");
		return "i am miya! [hi method]";
	}


	@RequestMapping("/miya")
	public String callHome(){
		LOG.log(Level.INFO,"【miya】将要调用 service-hi 服务的info2 方法");
		return restTemplate.getForObject("http://localhost:8988/info2",String.class);
	}

}
