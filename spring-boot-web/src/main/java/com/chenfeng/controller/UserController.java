package com.chenfeng.controller;

import com.chenfeng.entity.User;
import com.chenfeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 * @author: lgaoyi
 * @date: 2018/2/8 9:56
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("get/{id}")
    public User get(@PathVariable("id") int id) {
        return userService.findById(id);
    }

    @RequestMapping("view/{id}")
    public String userView(@PathVariable("id") int id, Model model) {
        User user = userService.findById(id);
        if (user == null) {
            user = new User();
        }
        model.addAttribute("user", user);
        return "user";
    }
}
