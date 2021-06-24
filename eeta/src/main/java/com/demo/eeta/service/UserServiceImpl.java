package com.demo.eeta.service;

import com.demo.eeta.domain.UserVo;
import com.demo.eeta.mapper.UserMapper1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper1 mapper;


    @Override
    public List UserList() {
        return mapper.getUserList();
    }

    @Override
    public UserVo UserSelected(String id) {
        return mapper.selectUser(id);
    }
}
