package com.wormpex.hang.ims.archetype.biz;

import com.wormpex.hang.ims.archetype.model.ao.request.UserRequest;
import com.wormpex.hang.ims.archetype.model.po.UserPo;
import com.wormpex.hang.ims.archetype.service.UserService;
import com.wormpex.hang.ims.archetype.util.Result;
import org.apache.commons.lang.StringUtils;

import javax.annotation.Resource;

/**
 * @program: hang
 * @description:
 * @author: yuhang
 * @create: 2019-07-23 19:24
 **/
public class UserBiz {
    @Resource
    private UserService userService;

    public Result UserRegister(UserRequest req) {
        if (StringUtils.isEmpty(req.getUsername().trim()) || StringUtils.isEmpty(req.getPassword().trim())) {
            return Result.error("用户名或者密码不能为空");
        }
        UserPo user = userService.userInfo();
        if (user != null) {
            return Result.error("用户已存在");
        }
        UserPo newUser = new UserPo();
        newUser.setUsername(req.getUsername());
        newUser.setPassword(req.getPassword());
//        userService
        return Result.success();
    }

    public Result UserLogin(UserRequest req) {
        if (StringUtils.isEmpty(req.getUsername().trim()) || StringUtils.isEmpty(req.getPassword().trim())) {
            return Result.error("用户名或者密码不能为空");
        }
        UserPo user = userService.userInfo();
        if (user == null) {
            return Result.error("用户名不存在");
        }
        if (!user.getPassword().equals(req.getPassword())) {
            return Result.error("密码错误");
        }
        return Result.success();
    }
}
