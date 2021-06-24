package com.demo.eeta.service;

import com.demo.eeta.domain.UserVo;

import java.util.List;

public interface UserService {

//  유저 조회
    public List UserList();
//    유저 1명 조회
    public UserVo UserSelected(String id);
//  유저 등록


}
