package com.wkcto.dubbo.web;

import com.wkcto.dubbo.model.User;
import com.wkcto.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/userDetail")
    public String userDeatail(Model model,Integer id){

        User user = userService.queryUserById(id);
        Integer allUserCount = userService.queryAllUserCount();
        model.addAttribute("user",user);
        model.addAttribute("allUserCount",allUserCount);

        return "userDetail";

    }
}
