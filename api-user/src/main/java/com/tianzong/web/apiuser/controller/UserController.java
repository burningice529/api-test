package com.tianzong.web.apiuser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tianzong
 * @date 2020/7/9
 */
@RestController
@RequestMapping("user")
public class UserController {

    @GetMapping
    public String hello() {
        return "hello user";
    }

}
