package com.bjpowernode.jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;



public class JedisTransactionTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.174.131", 6379);
        jedis.auth("123456");
        Transaction multi = jedis.multi();
        multi.set("k6","v6");
        multi.set("k7","v7");
        multi.exec();

    }
    @Test
    public void doSome(){
        System.out.println("hello");
    }
}
