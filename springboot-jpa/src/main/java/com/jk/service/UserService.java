package com.jk.service;

import com.jk.model.UserBean;

import java.util.List;

public interface UserService {

    List<UserBean> queryUser();

    void addUser(UserBean user);

    void deleteUserById(Integer userId);

    UserBean queryUserListById(Integer userId);
}
