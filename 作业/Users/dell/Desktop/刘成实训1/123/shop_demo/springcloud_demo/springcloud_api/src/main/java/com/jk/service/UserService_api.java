package com.jk.service;

import com.jk.model.LogBean;
import com.jk.model.Newest;
import com.jk.model.User;
import org.springframework.web.bind.annotation.*;


import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface UserService_api {

    /*@GetMapping("queryUser")
    Map<String,Object> queryUser();
*/
    @PostMapping("addUser")
    void addUser(@RequestBody User user);

    @GetMapping("findAllUser")
    List findAllUser();

    @DeleteMapping("delUserById")
    void delUserById(@RequestParam("id") Integer id);

    @GetMapping("queryById")
    User queryById(@RequestParam("id") Integer id);

    @GetMapping("queryNewest")
    List<Newest> queryNewest();
}
