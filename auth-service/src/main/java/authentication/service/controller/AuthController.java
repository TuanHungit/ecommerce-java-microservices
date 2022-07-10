package authentication.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping
    public String status() {
        return "Hi, this is Auth Service!";
    }
}