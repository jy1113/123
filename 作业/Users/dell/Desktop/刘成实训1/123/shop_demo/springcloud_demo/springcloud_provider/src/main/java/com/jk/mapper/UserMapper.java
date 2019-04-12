package com.jk.mapper;

import com.jk.model.Newest;
import com.jk.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * 查询User表
     * @return
     */
    List findAllUser();

    /**
     * 新增数据
     * @param user
     */
    void addUser(@Param("user") User user);

    /**
     * 根据删除
     * @param id
     */
    void delUserById(@Param("id") Integer id);

    /**
     * 根据Id查询
     * @param id
     * @return
     */
    User queryById(@Param("id") Integer id);

    /**
     * 修改
     * @param user
     */
    void updateUser(User user);


    List<Newest> queryNewest();
}
