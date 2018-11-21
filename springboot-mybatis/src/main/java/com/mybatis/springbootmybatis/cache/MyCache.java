package com.mybatis.springbootmybatis.cache;

import com.mybatis.springbootmybatis.utils.SpringUtils;
import com.redis.springbootredis.rediscache.service.RedisService;
import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.cache.CacheException;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;

public class MyCache implements Cache {

    private final String id;

    private Map<Object, Object> cache = new HashMap<Object, Object>();

    public MyCache(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getSize() {
        return SpringUtils.getBean(RedisService.class).size();
    }

    @Override
    public void putObject(Object key, Object value) {
        System.out.println(String.format("缓存数据.key:%s,value:",key,value));
        SpringUtils.getBean(RedisService.class).add(key, value);
    }

    @Override
    public Object getObject(Object key) {
        System.out.println(String.format("读取缓存数据.key:%s",key));
        return SpringUtils.getBean(RedisService.class).get(key);
    }

    @Override
    public Object removeObject(Object key) {
        System.out.println(String.format("删除缓存数据.key:%s",key));
        return SpringUtils.getBean(RedisService.class).delete(key);
    }

    @Override
    public void clear() {
        System.out.println(String.format("清除缓存数据。"));
        SpringUtils.getBean(RedisService.class).clear();
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (getId() == null) {
            throw new CacheException("Cache instances require an ID.");
        }
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cache)) {
            return false;
        }

        Cache otherCache = (Cache) o;
        return getId().equals(otherCache.getId());
    }

    @Override
    public int hashCode() {
        if (getId() == null) {
            throw new CacheException("Cache instances require an ID.");
        }
        return getId().hashCode();
    }
}
