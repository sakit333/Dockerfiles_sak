package com.example.hellodevops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloDevOpsApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloDevOpsApplication.class, args);
    }

    @GetMapping("/")
    public String helloDevOps() {
        return "Hello DevOps";
    }
}
