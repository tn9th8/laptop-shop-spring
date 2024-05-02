package vn.nhannt.laptopshop.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// Spring MVC
// MVC pattern
@Controller
public class DashboardController {
    // get home view
    @RequestMapping("/admin")
    public String getDashboard() {
        return "admin/dashboard/home-page";
    }
}
