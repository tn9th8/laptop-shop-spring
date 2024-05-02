package vn.nhannt.laptopshop.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("/admin/product")
    public String getDashboard() {
        return "admin/product/show";
    }
}
