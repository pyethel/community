package com.lzy.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * date: 2020/7/29 13:27
 *
 * @author pyethel
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name")String name, Model model){

        model.addAttribute("name",name);
        return "hello";
    }
}
