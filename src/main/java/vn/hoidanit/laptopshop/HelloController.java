package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Hello Spring framework";
    }

    @GetMapping("/user")
    public String userPage() {
        return "This page is only accessed by user";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "This page is only accessed by admin";
    }

}
