package com.wormpex.hang.ims.archetype.dao;


import com.wormpex.hang.ims.archetype.model.po.UserPo;


public interface UserDao {
    UserPo getUserByUsername();

    void insertUser(UserPo user);
}
