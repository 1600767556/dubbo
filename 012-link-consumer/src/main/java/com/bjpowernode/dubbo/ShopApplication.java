package com.bjpowernode.dubbo;

import com.bjpowernode.dubbo.service.ShopService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShopApplication {
    public static void main(String[] args) {
        String path ="dubbo-link-consumer.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
        applicationContext.start();
        ShopService shopService = (ShopService) applicationContext.getBean("shopService");
        String hello = shopService.Hello();
        System.out.println(hello);

    }
}
