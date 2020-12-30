package com.wormpex.hang.ims.archetype.controller;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import com.wormpex.hang.ims.archetype.biz.UserBiz;
import com.wormpex.hang.ims.archetype.model.ao.request.UserRequest;
import com.wormpex.hang.ims.archetype.model.po.UserPo;
import com.wormpex.hang.ims.archetype.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @program: hang
 * @description:
 * @author: yuhang
 * @create: 2019-07-23 18:25
 **/
@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserBiz userbiz;

    @RequestMapping(value = "/register")
    public Result register(UserRequest req) {
        return userbiz.UserRegister(req);
    }

    @RequestMapping(value = "login")
    public Result login(UserRequest req) {

        return userbiz.UserLogin(req);
    }
}