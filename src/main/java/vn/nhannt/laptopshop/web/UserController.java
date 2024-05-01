package vn.nhannt.laptopshop.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.nhannt.laptopshop.domain.User;
import vn.nhannt.laptopshop.service.UserService;

// Spring MVC
// MVC pattern
@Controller
public class UserController {
    private final UserService userService;

    // DI
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // get create user page
    @RequestMapping(value = "/admin/user/create", method = RequestMethod.GET)
    public String getCreatePage(Model model) {
        model.addAttribute("userView", new User());
        return "admin/user/create-page";
    }

    // create user
    @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
    public String handleCreateOne(@ModelAttribute("userView") User userView) {
        this.userService.createOne(userView);
        return "redirect:/admin/user/list";
    }

    // get update user page
    @GetMapping("/admin/user/update/{id}")
    public String getUpdatePage(Model model, @PathVariable Long id) {
        User user = this.userService.getOne(id);
        model.addAttribute("userView", user);
        return "admin/user/update-page";
    }

    // update one
    @PostMapping("/admin/user/update")
    public String handleUpdateOne(Model model, @ModelAttribute("userView") User userView) {
        this.userService.updateOne(userView);
        return "redirect:/admin/user/list";
    }

    // get delete user
    @GetMapping("/admin/user/delete/{id}")
    public String getDeletePage(Model model, @PathVariable Long id) {
        model.addAttribute("userView", new User());
        model.addAttribute("id", id);
        return "admin/user/delete-page";
    }

    // delete one
    @PostMapping("/admin/user/delete")
    public String handleDeleteOne(Model model, @ModelAttribute("userView") User userView) {
        // userView.setId((long) 10);
        this.userService.deleteOne(userView);
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
