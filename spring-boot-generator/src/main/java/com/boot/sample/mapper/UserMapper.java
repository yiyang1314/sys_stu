package com.boot.sample.mapper;

import com.boot.sample.common.MyMapper;
import com.boot.sample.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends MyMapper<User> {
}