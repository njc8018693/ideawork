package com.jk.service.impl;

import com.jk.mapper.UserMapper;
import com.jk.model.UserBean;
import com.jk.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class userServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<UserBean> queryUser() {

        return userMapper.findAll();
    }

    @Override
    public void addUser(UserBean user) {
        Integer userId = user.getUserId();
        if (userId!=null){

            userMapper.save(user);
        }
          userMapper.save(user);
    }

    @Override
    public void deleteUserById(Integer userId) {
       /* UserBean userBean = new UserBean();
        userBean.setUserId(userId);*/
        userMapper.delete(userId);
    }

    @Override
    public UserBean queryUserListById(Integer userId) {

        return userMapper.findOne(userId);
    }
}
