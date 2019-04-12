package com.jk.controller;

import com.jayway.jsonpath.Criteria;
import com.jk.model.Newest;
import com.jk.model.User;
import com.jk.service.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("query")
public class UserController {

    @Autowired
    private UserServiceFeign userServiceFeign;

    @Autowired
    public MongoTemplate mongoTemplate;
   /* @GetMapping("queryUser")
    @ResponseBody
    public Map<String,Object>   queryUser(){
        return userServiceFeign.queryUser();
    }
*/
   @Autowired
   private RedisTemplate<String, Object> redisTemplate;
    @GetMapping("findAllUser")
    @ResponseBody
    public List<User> queryBook() {
        List<User> list = new ArrayList<>();
        String cachepower = "qwe";
        //1先判断缓存中是否有
        Boolean hasKey = redisTemplate.hasKey(cachepower);
        if (hasKey) {
            //2如果有从缓存中取出
            System.out.println("走缓存-------");
            list = (List<User>) redisTemplate.opsForValue().get(cachepower);
        } else {
            //3如果没有先去数据库查询
            System.out.println("走数据库-------");
            list = userServiceFeign.findAllUser();
            //再将查询结果存入缓存
            redisTemplate.opsForValue().set(cachepower, list);
            //设置过期时间
            redisTemplate.expire(cachepower, 30, TimeUnit.SECONDS);
        }
        return list;

    }
    @PostMapping("addUser")
    @ResponseBody
    public void addUser( User user){
        System.out.println(user.toString()+"=========================================");
        userServiceFeign.addUser(user);
    }

/*
    @GetMapping("findAllUser")
    @ResponseBody
    public List findAllUser(){
        return userServiceFeign.findAllUser();
    }
*/

    @ResponseBody
    @DeleteMapping("delUserById")
    public void delUserById(Integer id){
        System.out.println(id+"==================================================================");
        userServiceFeign.delUserById(id);
    }

    @ResponseBody
    @GetMapping("queryById")
    public User queryById(Integer id){
        return userServiceFeign.queryById(id);
    }

    @RequestMapping("show")
    public String show (){
        return "show";
    }



    @RequestMapping("asd")
    public String show1 (){
        return "medical";
    }

    @RequestMapping("book")
    public String book (){
        return "book";
    }

    @RequestMapping("get")
    @ResponseBody
    public List<User> queryUserList(){
       /*List<User> find = mongoTemplate.find(new Query().addCriteria(Criteria.where("pid").is(id)), User.class);*/
        List<User> all = mongoTemplate.findAll(User.class);
        System.out.println(all.toString());
        return all;
    }



    @ResponseBody
    @RequestMapping("add")
    public void sand() {
        List<User> List = new ArrayList<User>();
        User bootTree = new User();
        bootTree.setId(1);
        bootTree.setUsername("星月相依");
        bootTree.setUserpswd("-1");
        bootTree.setLoginacct("321");
        bootTree.setEmail("123");
        List.add(bootTree);
        mongoTemplate.insertAll(List);
    }



    /*
    * 查询最新招商
    * */
    @GetMapping("queryNewest")
    @ResponseBody
    public List<Newest> queryNewest(){
        return userServiceFeign.queryNewest();
    }


}

  /*  *//*  List<User> list = userServiceFeign.findAllUser();*//*
    List<User> bootTree = new ArrayList<>();
        bootTree.setId(1);
                bootTree.setUsername("星月相依");
                bootTree.setUserpswd("-1");
                bootTree.setLoginacct("asdadasdasdas");
                List.add(bootTree);
                mongoTemplate.insertAll(list);
//        for (User tree : list) {
//            List<User> list2 = new ArrayList<>();
//            User bootTree = new User();
//            bootTree.setId(tree.getId());
//            bootTree.setUsername(tree.getUsername());
//            bootTree.setUserpswd(tree.getUserpswd());
//            bootTree.setLoginacct(tree.getLoginacct());
//            list2.add(bootTree);
//            mongoTemplate.insertAll(list2);
//        }
        *//*for(int i = 0 ; i < list.size();i++){
            List<User> list2 = new ArrayList<>();
            list2.add(list.get(i));
            mongoTemplate.insertAll(list2);
        }
        System.out.println(list.toString());*//*
//
                }
*/