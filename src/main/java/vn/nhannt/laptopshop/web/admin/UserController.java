package vn.nhannt.laptopshop.web.admin;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.ServletContext;
import vn.nhannt.laptopshop.domain.User;
import vn.nhannt.laptopshop.service.FileUploadService;
import vn.nhannt.laptopshop.service.RoleService;
import vn.nhannt.laptopshop.service.UserService;

// Spring MVC
// MVC pattern
@Controller
public class UserController {
    private final UserService userService;
    private final RoleService roleService;
    private final FileUploadService fileUploadService;
    private final PasswordEncoder encoder;

    // DI
    public UserController(
            UserService userService,
            RoleService roleService,
            FileUploadService fileUploadService,
            PasswordEncoder encoder) {
        this.userService = userService;
        this.roleService = roleService;
        this.fileUploadService = fileUploadService;
        this.encoder = encoder;
    }

    // get create user page
    @RequestMapping(value = "/admin/user/create", method = RequestMethod.GET)
    public String getCreatePage(Model model) {
        model.addAttribute("userView", new User());
        return "admin/user/create-page";
    }

    // create user
    @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
    public String handleCreateOne(
            @ModelAttribute("userView") User userView,
            @RequestParam("fileView") MultipartFile file) {
        // store file on server
        String finalFileName = this.fileUploadService.store(file, "user");
        // prepare user
        userView.setAvatar(finalFileName);
        userView.setPassword(this.encoder.encode(userView.getPassword()));
        userView.setRole(this.roleService.getOneByName(userView.getRole().getName()));
        // upsert user
        this.userService.createOne(userView);

        return "redirect:/admin/user";
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
    public String handleUpdateOne(Model model,
            @ModelAttribute("userView") User userView,
            @RequestParam("fileView") MultipartFile file) {
        // store file on server
        String finalFileName = this.fileUploadService.store(file, "user");
        // prepare user
        userView.setAvatar(finalFileName);
        userView.setRole(this.roleService.getOneByName(userView.getRole().getName()));
        // upsert user
        this.userService.updateOne(userView);
        return "redirect:/admin/user";
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
        return "redirect:/admin/user";
    }

    // get all
    @RequestMapping("/admin/user")
    public String handleGetAll(Model model) {
        List<User> users = this.userService.getAll();
        model.addAttribute("usersView", users);
        return "admin/user/home-page";
    }

    // get one
    @RequestMapping("/admin/user/{id}")
    public String handleGetOne(Model model, @PathVariable Long id) {
        User user = this.userService.getOne(id);
        model.addAttribute("userView", user);
        return "admin/user/detail-page";
    }
}
