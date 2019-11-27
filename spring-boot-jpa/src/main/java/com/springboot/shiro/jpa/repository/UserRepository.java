package com.springboot.shiro.jpa.repository;

import com.springboot.shiro.jpa.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  UserRepository extends JpaRepository<UserInfo, Integer> {

}
