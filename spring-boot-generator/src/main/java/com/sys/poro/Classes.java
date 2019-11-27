package com.sys.poro;

import javax.persistence.*;

@Table(name = "t_classes")
public class Classes {
    /**
     * 班级id
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 课程名称
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 教师编号
     */
    @Column(name = "tea_id")
    private Integer teaId;

    /**
     * 班级编号
     */
    @Column(name = "class_no")
    private Integer classNo;

    /**
     * 获取班级id
     *
     * @return id - 班级id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置班级id
     *
     * @param id 班级id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取课程名称
     *
     * @return name - 课程名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置课程名称
     *
     * @param name 课程名称
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取教师编号
     *
     * @return tea_id - 教师编号
     */
    public Integer getTeaId() {
        return teaId;
    }

    /**
     * 设置教师编号
     *
     * @param teaId 教师编号
     */
    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    /**
     * 获取班级编号
     *
     * @return class_no - 班级编号
     */
    public Integer getClassNo() {
        return classNo;
    }

    /**
     * 设置班级编号
     *
     * @param classNo 班级编号
     */
    public void setClassNo(Integer classNo) {
        this.classNo = classNo;
    }
}