package com.example.bootdata.service.impl;

import com.example.bootdata.dao.UserMapper;
import com.example.bootdata.entity.User;
import com.example.bootdata.entity.UserExample;
import com.example.bootdata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * user: ken
 * data: 2021/5/19 14:29
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int deleteByExample(UserExample example) {
        return userMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return  userMapper.deleteByPrimaryKey(id);
    }
    @Override
    public int insert(User record) {
        return  userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return  userMapper.insertSelective(record);
    }

    @Override
    public List<User> selectByExample(UserExample example) {
        return  userMapper.selectByExample(example);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return  userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return  userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return  userMapper.updateByPrimaryKey(record);
    }
}
