package com.test.cloud.test;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Feign 基于接口的注解，定义一个feign接口，通过@FeignClient("服务名")来指定调用哪个服务
 *  比如下面调用service-hi服务的"hi"接口
 */
@FeignClient(value = "service-hi"/*,fallback = SchedualServiceHiHystric.class*/)
public interface SchedualServiceHi {

    @RequestMapping(value="hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value="name") String name);
}
