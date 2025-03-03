package com.daddy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpkApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpkApplication.class, args);
        System.out.println("API 🔥 Started");
    }
}

@RestController
@RequestMapping("/spk")
class DaddyController {

    @GetMapping("/hello")
    public String helloSpk() {
        return "Hello Pravin";
    }
}
