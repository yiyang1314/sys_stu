package com.sys.poro;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_student")
public class Student {
    /**
     * 学号
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
     * 年级
     */
    private String grade;

    /**
     * 专业
     */
    private String professional;

    /**
     * 班级编号
     */
    @Column(name = "class_id")
    private Integer classId;

    /**
     * 学生编号
     */
    @Column(name = "stu_no")
    private Integer stuNo;

    /**
     * 获取学号
     *
     * @return id - 学号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置学号
     *
     * @param id 学号
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 获取年级
     *
     * @return grade - 年级
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置年级
     *
     * @param grade 年级
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 获取专业
     *
     * @return professional - 专业
     */
    public String getProfessional() {
        return professional;
    }

    /**
     * 设置专业
     *
     * @param professional 专业
     */
    public void setProfessional(String professional) {
        this.professional = professional;
    }

    /**
     * 获取班级编号
     *
     * @return class_id - 班级编号
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * 设置班级编号
     *
     * @param classId 班级编号
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * 获取学生编号
     *
     * @return stu_no - 学生编号
     */
    public Integer getStuNo() {
        return stuNo;
    }

    /**
     * 设置学生编号
     *
     * @param stuNo 学生编号
     */
    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }
}