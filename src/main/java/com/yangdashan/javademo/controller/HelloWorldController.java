package com.yangdashan.javademo.controller;

@RestController

public class HelloWorldController {

    @RequestMapping("/getWorld")
    public String getWorldName() {
        return "三体世界！";

    }
}
