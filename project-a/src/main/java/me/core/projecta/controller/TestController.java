package me.core.projecta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/hey")
    public String hey(){
        return "HEEY";
    }
}
