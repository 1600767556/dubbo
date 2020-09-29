package com.bjpowernode.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class UserApplication {
    public static void main(String[] args) throws IOException {
        String path ="dubbo-link-provider.xml";
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(path);
        System.in.read();
    }
}
