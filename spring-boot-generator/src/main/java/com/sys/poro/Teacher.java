package com.sys.poro;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_teacher")
public class Teacher {
    /**
     * 主键
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 教师编号
     */
    @Column(name = "tea_no")
    private Integer teaNo;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 家庭地址
     */
    private String address;

    /**
     * 注册时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 课程编号
     */
    @Column(name = "course_id")
    private Integer courseId;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取教师编号
     *
     * @return tea_no - 教师编号
     */
    public Integer getTeaNo() {
        return teaNo;
    }

    /**
     * 设置教师编号
     *
     * @param teaNo 教师编号
     */
    public void setTeaNo(Integer teaNo) {
        this.teaNo = teaNo;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取家庭地址
     *
     * @return address - 家庭地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置家庭地址
     *
     * @param address 家庭地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取注册时间
     *
     * @return createTime - 注册时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置注册时间
     *
     * @param createtime 注册时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取课程编号
     *
     * @return course_id - 课程编号
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * 设置课程编号
     *
     * @param courseId 课程编号
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}