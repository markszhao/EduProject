package com.yuxiu.edu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhaodan
 * @create 2019-02-12 18:18
 **/
@Controller
@RequestMapping("employee")
public class EmlpoyeeController {

    @RequestMapping("manage")
    public String manage(){
        return "employee/manage";
    }

    @RequestMapping("info")
    public String info(){
        return "employee/info";
    }

    @RequestMapping("edit")
    public String edit(){
        return "emlpoyee/edit";
    }
}
