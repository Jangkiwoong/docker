package org.example.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerApplication {
    @RequestMapping("/test")
    public String test(){
        String hi = "test_Server_1";
        return hi;
    }
    public static void main(String[] args) {
        SpringApplication.run(DockerApplication.class, args);
    }

}
