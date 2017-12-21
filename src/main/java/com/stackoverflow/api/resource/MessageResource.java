package com.stackoverflow.api.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/message")
public class MessageResource {

    @GetMapping
    public String sayHi() {
        return "Say Hi because hello is complicated enought!";
    }
}