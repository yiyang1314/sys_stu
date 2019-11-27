package com.sys.poro;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_score")
public class Score {
    /**
     * 学分编号
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 学分类型
     */
    private Integer type;

    /**
     * 注册时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 学分制
     */
    private Integer creadit;

    /**
     * 学生编号
     */
    @Column(name = "stu_no")
    private Integer stuNo;

    /**
     * 获取学分编号
     *
     * @return id - 学分编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置学分编号
     *
     * @param id 学分编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取学分类型
     *
     * @return type - 学分类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置学分类型
     *
     * @param type 学分类型
     */
    public void setType(Integer type) {
        this.type = type;
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
     * 获取学分制
     *
     * @return creadit - 学分制
     */
    public Integer getCreadit() {
        return creadit;
    }

    /**
     * 设置学分制
     *
     * @param creadit 学分制
     */
    public void setCreadit(Integer creadit) {
        this.creadit = creadit;
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