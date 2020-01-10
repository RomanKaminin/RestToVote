package ru.resttovote.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/main")
    public String getMainMessage() {
        //curl -i -X GET localhost:8080/main
        return "Hello API";
    }
}
