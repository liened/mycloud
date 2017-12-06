package com.test.cloud.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017-12-4.
 */
@RestController
public class HiController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }

}
