package vn.nhannt.laptopshop.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String handleHomePage() {
        return "hello Spring MVC";
    }
}
