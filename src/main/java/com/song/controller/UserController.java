package com.song.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Song on 2017/2/15.
 * User控制层
 */
@Controller
public class UserController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    public String show(){
        return "Hello World";
    }
}
