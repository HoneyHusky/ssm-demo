package com.by.service.impl;

import com.by.mapper.UserMapper;
import com.by.pojo.User;
import com.by.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> queryUser() {
        return userMapper.queryUser();
    }
}
