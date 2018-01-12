package com.qiuchaojie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qiuchaojie on 2018/1/12.
 */
@RequestMapping("/first")
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String say(){
        return "hello";
    }
}
