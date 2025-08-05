package com.univille.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Retorna apenas os dados em json
@RequestMapping("/")
public class TestEndPointController {

    @GetMapping("/")
    public String publicEndPoint(){
        return "Public endpoint";
    }

    @GetMapping("/user")
    public String userEndPoint(){
        return "User endpoint";
    }

    @GetMapping("/admin")
    public String adminEndPoint(){
        return "Admin endpoint";
    }

}
