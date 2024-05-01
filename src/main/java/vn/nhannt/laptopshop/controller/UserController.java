package vn.nhannt.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.nhannt.laptopshop.domain.User;
import vn.nhannt.laptopshop.service.UserService;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/admin/user")
    public String getUserPage(Model model) {
        model.addAttribute("userView", new User());
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
    public String createUserPage(@ModelAttribute("userView") User userView) {
        System.out.println("run here: " + userView.toString());
        return "hello";
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        String test = userService.handleHomePage();
        model.addAttribute("test", test);
        return "hello";
    }

}
