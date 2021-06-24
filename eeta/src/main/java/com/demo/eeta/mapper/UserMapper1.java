package com.demo.eeta.mapper;

import com.demo.eeta.domain.UserVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserMapper1 {

    //    유저 리스트
//    List<UserVo> selectUsers(UserVo param);
    List<UserVo> getUserList();
    //    유저 1명 조회
    UserVo selectUser(String id);


}
