package com.jk.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

import java.util.Date;

@Document(collection = "t_namespace")
public class User {

    private Integer id;

    private String loginacct;

    private String userpswd;

    private String username;

    private String email;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginacct='" + loginacct + '\'' +
                ", userpswd='" + userpswd + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
//@JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    //@DateTimeFormat(pattern="yyyy-MM-dd")
    //private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginacct() {
        return loginacct;
    }

    public void setLoginacct(String loginacct) {
        this.loginacct = loginacct;
    }

    public String getUserpswd() {
        return userpswd;
    }

    public void setUserpswd(String userpswd) {
        this.userpswd = userpswd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public Date getCreatetime() {
//        return createtime;
//    }
//
//    public void setCreatetime(Date createtime) {
//        this.createtime = createtime;
//    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", loginacct='" + loginacct + '\'' +
//                ", userpswd='" + userpswd + '\'' +
//                ", username='" + username + '\'' +
//                ", email='" + email + '\'' +
//                ", createtime=" + createtime +
//                '}';
//    }
}
