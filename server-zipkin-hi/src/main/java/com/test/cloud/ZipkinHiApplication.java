package com.test.cloud;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;

@SpringBootApplication
@RestController
public class ZipkinHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinHiApplication.class, args);
	}

	private static final Logger LOG = Logger.getLogger(ZipkinHiApplication.class.getName());

	@Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/hi")
	public String callHome(){
		LOG.log(Level.INFO,"【service-hi】将要调用 miya 的 miya 方法");
		return restTemplate.getForObject("http://localhost:8989/miya",String.class);
	}

	@RequestMapping("/info2")
	public String info2(){
		LOG.log(Level.INFO,"【service-hi】服务的info2方法被调用了");
		return "i am service-hi's info method";
	}

//	@Bean
//	public AlwaysSampler defaultSample(){
//		return new AlwaysSampler();
//	}


}
