package com.tianzong.web.apiorder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yes_i
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @GetMapping
    public String hello() {
        return "hello order";
    }

}
