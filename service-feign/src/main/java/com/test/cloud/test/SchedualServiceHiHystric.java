package com.test.cloud.test;

import org.springframework.stereotype.Component;

/**
 * SchedualServiceHi的断路器断路Service
 */
@Component
public class SchedualServiceHiHystric /* implements SchedualServiceHi*/{

    //@Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
