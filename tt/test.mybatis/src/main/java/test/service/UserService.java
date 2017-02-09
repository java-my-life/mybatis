package test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.entity.User;
import test.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	UserMapper userMapper;
	
	public void query(){
		List<User> list = userMapper.query();
		System.out.println(list.size());
	}
}
