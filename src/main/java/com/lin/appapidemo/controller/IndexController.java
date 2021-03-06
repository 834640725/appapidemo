package com.lin.appapidemo.controller;

import com.lin.appapidemo.model.User;
import com.lin.appapidemo.service.UserService;
import com.lin.appapidemo.util.MD5;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private UserService userService;
    @ApiOperation(value="流书api首页",notes="")
    @RequestMapping(value="index",method = RequestMethod.GET)
    public String index(){
        return "hello world!";
    }
}
