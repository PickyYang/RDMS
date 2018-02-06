package com.yang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Frank Yang on 2018-02-06.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        System.out.println(1);
        map.addAttribute("host", "http://blog.didispace.com");
        return "index";
    }
}
