package test.mapper;

import java.util.List;

import test.entity.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
    
    List<User> query();
}