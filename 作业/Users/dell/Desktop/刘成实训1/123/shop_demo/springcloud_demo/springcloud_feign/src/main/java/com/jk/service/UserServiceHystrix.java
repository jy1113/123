package com.jk.service;

import com.jk.model.Newest;
import com.jk.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceHystrix implements  UserServiceFeign{
    @Override
    public void addUser(User user) {

    }

    @Override
    public List findAllUser() {
      /*  User user = new User;
        user.setEmail("网络异常");*/
        List list = new ArrayList();
        list.add("网络异常");
        return list;
    }

    @Override
    public void delUserById(Integer id) {

    }

    @Override
    public User queryById(Integer id) {
        return null;
    }

    @Override
    public List<Newest> queryNewest() {
        return null;
    }
}
