package com.wkcto.dubbo.service;

import com.wkcto.dubbo.model.User;

public interface UserService {
    User queryUserById(Integer id);
    Integer queryAllUserCount();

}
