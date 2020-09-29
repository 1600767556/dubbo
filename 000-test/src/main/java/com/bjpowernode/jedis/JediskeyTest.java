package com.bjpowernode.jedis;

import redis.clients.jedis.Jedis;


public class JediskeyTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.174.131", 6379);
        jedis.auth("123456");
      /*  String ping = jedis.ping();
        System.out.println(ping);*/
     /*   Set<String> keys = jedis.keys("*");
        for (String key : keys) {
            System.out.println(key);
        }

        Boolean k2 = jedis.exists("k2");
        System.out.println(k2);*/
/*
        Long k4 = jedis.move("k4", 1);
        System.out.println(k4);*/
        jedis.select(1);
        String k4 = jedis.get("k4");
        System.out.println(k4);
    }
}
