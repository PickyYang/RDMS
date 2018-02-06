package com.yang.controller;

import com.yang.Domain.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Frank Yang on 2018-02-06.
 */
@RestController
public class TestController {
    private Logger logger = LogManager.getLogger(TestController.class);

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public User getUser() {
        User user = new User();
        user.setName("张三");
        user.setPassword("123456");
        user.setCreateTime(new Date());
        user.setRemarks("this is remark");
        logger.info(user);
        return user;
    }
}
