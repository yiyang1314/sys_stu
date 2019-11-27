package com.springboot.shiro.jpa.repository;

import com.springboot.shiro.jpa.entity.SysRole;
import com.springboot.shiro.jpa.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface SysRoleRepository  extends JpaRepository<SysRole, Integer> {

    UserInfo findByUserName(String userName);

    UserInfo findByUserNameOrEmail(String username, String email);

    @Transactional(timeout = 10)
    @Modifying
    @Query("update UserInfo set userName = ?1 where id = ?2")
    int modifyById(String  userName, Long id);

    @Transactional
    @Modifying
    @Query("delete from UserInfo where id = ?1")
    void deleteById(Long id);

    @Query("select u from UserInfo u where u.email = ?1")
    UserInfo findByEmail(String email);

    @Query("select u from UserInfo u")
    Page<User> findALL(Pageable pageable);

    Page<User> findByNickName(String nickName, Pageable pageable);

    Slice<User> findByNickNameAndEmail(String nickName, String email,Pageable pageable);
}
