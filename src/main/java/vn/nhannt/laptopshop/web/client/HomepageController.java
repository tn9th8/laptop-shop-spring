package vn.nhannt.laptopshop.web.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomepageController {
    @RequestMapping("/")
    public String getShowPage() {
        return "client/homepage/show-page";
    }

}
