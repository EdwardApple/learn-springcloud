package com.example.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @GetMapping("/get/{id}")
    public String get(@PathVariable String id) {
        System.out.println("provider 提供id：" + id);
        return "provider 提供id：" + id;
    }

}
