package vn.nhannt.laptopshop.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

    @GetMapping("/admin/order")
    public String getDashboard() {
        return "admin/order/home-page";
    }
}