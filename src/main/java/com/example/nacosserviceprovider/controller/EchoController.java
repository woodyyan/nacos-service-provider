package com.example.nacosserviceprovider.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class EchoController {
    @GetMapping("/echo/{string}")
    public String echo(@PathVariable String string) {
        return string;
    }
}
