package test.mapper;

import test.entity.UserSub;

public interface UserSubMapper {
    int insert(UserSub record);

    int insertSelective(UserSub record);
}