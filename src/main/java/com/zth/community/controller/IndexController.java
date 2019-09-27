package com.zth.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Author: 3zZ.
 * Date: 2019/9/27 6:05 下午
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String hello(){
        return "index";
    }
}
