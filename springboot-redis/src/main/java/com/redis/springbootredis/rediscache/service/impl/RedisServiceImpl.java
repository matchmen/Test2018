package com.redis.springbootredis.rediscache.service.impl;

import com.redis.springbootredis.rediscache.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public boolean add(Object key, Object value) {

        return redisTemplate.opsForValue().setIfAbsent(key, value);
    }

    @Override
    public Object get(Object key) {
        return redisTemplate.opsForValue().get(key);
    }

    @Override
    public Object delete(Object key) {
        Object obj = get(key);
        if(redisTemplate.persist(key)) {
            redisTemplate.delete(key);
        }
        return obj;
    }

    @Override
    public Object update(Object key,Object value) {

        if(redisTemplate.persist(key)) {
            redisTemplate.opsForValue().set(key, value);
        }else{
            add(key, value);
        }

        return value;

    }

    @Override
    public int size() {
        return 0;

    }

    @Override
    public void clear() {
        //redisTemplate.
    }
}
