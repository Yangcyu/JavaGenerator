package com.ycy.demo.controller;

import com.ycy.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ycy
 */
@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String getInfo(){
        return "hello";
    }
}