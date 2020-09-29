package com.bjpowernode.dubbo.service.impl;

import com.bjpowernode.dubbo.service.ShopService;
import com.bjpowernode.dubbo.service.UserService;

public class ShopServiceImpl implements ShopService {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String Hello() {
        String sayHello = userService.sayHello();
        return sayHello;
    }
}
