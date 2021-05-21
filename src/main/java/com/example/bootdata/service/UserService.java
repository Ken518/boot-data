package com.example.bootdata.service;

import com.example.bootdata.entity.User;
import com.example.bootdata.entity.UserExample;

import java.util.List;

/**
 * user: ken
 * data: 2021/5/19 14:29
 */
public interface UserService {

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
