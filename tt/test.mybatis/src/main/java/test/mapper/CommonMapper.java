package test.mapper;

import test.entity.User;
import tk.mybatis.mapper.common.Mapper;

public interface CommonMapper extends Mapper<User> {
  //其他必须手写的接口...

}