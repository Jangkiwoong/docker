package org.example.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/api")
    public String hello() {
        String asd = "hello world/2";
        return asd;
    }
}
