package com.py.springboot.web;

import com.py.springboot.base.BaseResult;
import com.py.springboot.entity.User;
import com.py.springboot.enums.StateEnum;
import com.py.springboot.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * UserController
 * 用户增删改查接口测试(swagger文档测试)
 * @author pysasuke
 * @date 2017/9/13
 */
@RestController
@RequestMapping(value = "/user/v1")
public class UserController {
    @Resource
    private UserService userService;


    @ApiOperation(value = "新增用户", notes = "新增用户")
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public BaseResult addUser(@RequestBody User user) {
        userService.addUser(user);
        return BaseResult.success();
    }

    @ApiOperation(value = "根据用户id查找用户", notes = "根据用户id查找用户")
    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public BaseResult getById(@RequestParam("id") Long id) {
        User user = userService.selectByPrimaryKey(id);
        return new BaseResult(StateEnum.SUCCESS.getState(), StateEnum.SUCCESS.getStateInfo(), user);

    }

    @ApiOperation(value = "根据用户id修改用户", notes = "根据用户id修改用户")
    @RequestMapping(value = "/updateById", method = RequestMethod.PUT)
    public BaseResult updateById(@RequestBody User user) {
        userService.updateUser(user);
        return BaseResult.success();
    }

    @ApiOperation(value = "根据用户id删除用户", notes = "根据用户id删除用户")
    @RequestMapping(value = "/deleteById", method = RequestMethod.DELETE)
    public BaseResult deleteById(@RequestParam("id") Long id) {
        userService.deleteUser(id);
        return BaseResult.success();
    }
}
