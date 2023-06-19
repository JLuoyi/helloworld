package com.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


public class UserInfo implements Serializable {
    private Integer id;
    private String userName;
    private String password;
    private String nickName;
    private String tel;
    private String address;
    private Integer sex;
    private String avatar;
    private Date createTime;
    private Integer status;

    public UserInfo(Integer id, String userName, String password, String nickName, String tel, String address, Integer sex, String avatar, Date createTime, Integer status) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.nickName = nickName;
        this.tel = tel;
        this.address = address;
        this.sex = sex;
        this.avatar = avatar;
        this.createTime = createTime;
        this.status = status;
    }

    public UserInfo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
