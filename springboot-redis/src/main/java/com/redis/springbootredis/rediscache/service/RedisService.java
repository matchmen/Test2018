package com.redis.springbootredis.rediscache.service;

public interface RedisService {

    public boolean add(Object key,Object value);

    public Object get(Object key);

    public Object delete(Object key);

    public Object update(Object key,Object value);

    public int size();

    public void clear();


}
