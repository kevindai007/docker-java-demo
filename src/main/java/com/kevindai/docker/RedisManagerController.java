package com.kevindai.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisManagerController {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;


    @PutMapping(value = "/put")
    public void put(String key, @RequestParam(required = false, defaultValue = "default") String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    @GetMapping(value = "/get")
    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
