package vn.nhannt.laptopshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.nhannt.laptopshop.domain.User;
import vn.nhannt.laptopshop.service.UserService;

@Controller
public class UserController {
    private final UserService userService;

    // DI
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // get create user page
    @RequestMapping("/admin/user/create")
    public String getCreatePage(Model model) {
        model.addAttribute("userView", new User());
        return "admin/user/create-page";
    }

    // create user
    @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
    public String handleCreateOne(@ModelAttribute("userView") User userView) {
        System.out.println("View: " + userView.toString());
        User newUser = this.userService.createOne(userView);
        System.out.println("Model: " + newUser.toString());
        return "redirect:/admin/user/list";
    }

    // get all
    @RequestMapping("/admin/user/list")
    public String handleGetAll(Model model) {
        List<User> users = this.userService.getAll();
        model.addAttribute("usersView", users);
        return "admin/user/table-page";
    }

    // get one
    @RequestMapping("/admin/user/detail/{id}")
    public String handleGetOne(Model model, @PathVariable Long id) {
        User user = this.userService.getOne(id);
        model.addAttribute("userView", user);
        return "admin/user/detail-page";
    }

    // get home view
    @RequestMapping("/")
    public String getHomePage(Model model) {
        String test = userService.getHomePage();
        model.addAttribute("test", test);
        return "hello-page";
    }

}
