package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 *
 * @author shencai.huang@hand-china.com
 * @date 1/15/2020 11:13
 * lastUpdateBy: shencai.huang@hand-china.com
 * lastUpdateDate: 1/15/2020
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public String hello(){
        return "Hello World!";
    }
}
