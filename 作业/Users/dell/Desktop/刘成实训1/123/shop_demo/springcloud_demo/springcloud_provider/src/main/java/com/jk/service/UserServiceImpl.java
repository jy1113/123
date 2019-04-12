package com.jk.service;

import com.jk.mapper.UserMapper;
import com.jk.model.LogBean;
import com.jk.model.Newest;
import com.jk.model.User;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;


import javax.servlet.http.HttpSession;

@Controller
public class UserServiceImpl implements UserService_api {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MongoTemplate mongoTemplate;

   /* @GetMapping("queryUser")
    @ResponseBody
    public Map<String,Object> queryUser(){
        Map<String,Object> user = new HashMap<>();
        user.put("userID","wqe12312");
        user.put("userName","张三");
        user.put("passWord","密码");
        return user;
    }*/

    @Override
    @PostMapping("addUser")
    @ResponseBody
    public void addUser(@RequestBody User user) {
        if (user.getId()!=null){
            userMapper.updateUser(user);
        }else{
            userMapper.addUser(user);
        }
    }


    @Override
    @GetMapping("findAllUser")
    @ResponseBody
    public List findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    @ResponseBody
    @DeleteMapping("delUserById")
    public void delUserById( Integer id) {
        userMapper.delUserById(id);
    }

    @Override
    @ResponseBody
    @GetMapping("queryById")
    public User queryById(Integer id) {
        return userMapper.queryById(id);
    }

    @Override
    @ResponseBody
    public List<Newest> queryNewest() {
        return userMapper.queryNewest();
    }




/*
    @Override
    public JSONObject findLog(Integer page, Integer rows, LogBean logBean, String flag, HttpSession session) {
        return null;
    }
*/

}
