package com.qiaolu.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qiaolu.user.mapper.UserMapper;
import com.qiaolu.user.pojo.User;
import com.qiaolu.user.service.UserService;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
	@Override
	public List<User> getUserList() {
		List<User> list = userMapper.getUserList();
		return  list;
	}

}
