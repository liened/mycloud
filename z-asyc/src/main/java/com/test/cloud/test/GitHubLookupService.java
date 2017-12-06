package com.test.cloud.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Future;

@Service
public class GitHubLookupService {
    private static final Logger logger = LoggerFactory.getLogger(GitHubLookupService.class);

    private final RestTemplate restTemplate = new RestTemplate();

    @Async
    public Future<User> findUser(String user) throws InterruptedException{
        logger.info("GitHubLookupService's findUser method .  Looking up: "+user);
        String url = String.format("https://api.github.com/users/%s",user);
        User results = restTemplate.getForObject(url,User.class);
        Thread.sleep(1000L);
        return new AsyncResult<>(results);
    }
}
