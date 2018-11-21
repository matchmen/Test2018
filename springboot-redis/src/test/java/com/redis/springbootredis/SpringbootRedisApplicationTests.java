package com.redis.springbootredis;

import com.redis.springbootredis.rediscache.service.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

    @Autowired
    private RedisService redisService;
    @Test
    public void contextLoads() {

        //redisService.add("1234","asaas");

        System.out.println(redisService.get("1234"));

    }

}
