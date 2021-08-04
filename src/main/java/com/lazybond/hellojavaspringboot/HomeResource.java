package com.lazybond.hellojavaspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeResource {

    @GetMapping("/home")
    public String getMessage(){
        return "Application deployed successfully on OpenShift through Docker & Jenkins...!!!";
    }
}
