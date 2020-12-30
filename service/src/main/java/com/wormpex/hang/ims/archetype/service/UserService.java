package com.wormpex.hang.ims.archetype.service;

import com.wormpex.hang.ims.archetype.dao.UserDao;
import com.wormpex.hang.ims.archetype.model.po.UserPo;
import com.wormpex.hang.ims.archetype.util.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @program: hang
 * @description:
 * @author: yuhang
 * @create: 2019-07-23 19:07
 **/

@Service
public class UserService {
    @Resource
    private UserDao userDao;


    public UserPo userInfo(){
        return userDao.getUserByUsername();
    }

}
