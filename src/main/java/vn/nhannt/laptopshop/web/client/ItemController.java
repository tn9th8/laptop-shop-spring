package vn.nhannt.laptopshop.web.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// item :: product
@Controller
public class ItemController {

    // get one
    @GetMapping("/product/{id}")
    public String handleGetOne(Model model, @PathVariable long id) {
        return "client/product/detail-page";
    }
}
