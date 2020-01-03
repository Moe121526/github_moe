package com.demo.controller;

import com.demo.service.DemoSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ce")
public class DemoController {
    @Autowired
    private DemoSerivce demoService;
    @RequestMapping("shi")
    public String demo(@RequestParam String username, Model model){
        String a =demoService.a(username);
        model.addAttribute("username",a);
        return "ok";
    }
}
