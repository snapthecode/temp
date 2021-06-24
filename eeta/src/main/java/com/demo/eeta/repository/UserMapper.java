package com.demo.eeta.repository;

import com.demo.eeta.domain.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {


    //  유저 조회
    List UserList();

    //    유저 1명 조회
    UserVo UserSelected(String id);

    //  유저 등록


}
