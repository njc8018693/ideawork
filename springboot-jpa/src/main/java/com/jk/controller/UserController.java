package com.jk.controller;

import com.jk.model.UserBean;
import com.jk.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("showuser")
    public String showuser(){
     return "userList";
    }

    @RequestMapping("to")
    public String to(){
     return "aa";
    }

    @RequestMapping("queryUser")
    @ResponseBody
    public List<UserBean> queryUser(){
        List<UserBean> list =  userService.queryUser();
        System.out.println(list);
        return list;
    }

    @RequestMapping("addUser")
    @ResponseBody
     public Boolean addUser(UserBean user){
        userService.addUser(user);
        return true;
    }

    @RequestMapping("deleteUserById")
    @ResponseBody
    public Boolean deleteUserById(Integer userId){
        userService.deleteUserById(userId);
        return true;
    }
    @RequestMapping("queryUserListById")
    @ResponseBody
    public UserBean queryUserListById(Integer userId){
        UserBean user = userService.queryUserListById(userId);
        return user;
    }

}
