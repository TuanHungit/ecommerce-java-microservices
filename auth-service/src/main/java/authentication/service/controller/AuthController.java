package authentication.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth-service")
public class AuthController {

    @GetMapping("/status")
    public String status() {
        return "Hello, this is Auth Service which is already CICD!";
    }
}
