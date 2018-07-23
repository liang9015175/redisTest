package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private RedisService redisService;

    @Test
    public void contextLoads() {
        User user = new User("1", "test");
        boolean test = redisService.save(RedisKeys.USER_TOKEN_INFO + "1", user);
        System.out.println(test
        );
        User select = redisService.select(RedisKeys.USER_TOKEN_INFO + "1",User.class);
        System.out.println(select);
    }


}
