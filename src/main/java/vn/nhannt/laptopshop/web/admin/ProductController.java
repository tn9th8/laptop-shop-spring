package vn.nhannt.laptopshop.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import vn.nhannt.laptopshop.domain.Product;

@Controller
public class ProductController {

    // create one
    @GetMapping("/admin/product/create")
    public String handleGetOne(Model model) {
        model.addAttribute("productView", new Product());
        return "admin/product/create-page";
    }

    // get all
    @GetMapping("/admin/product")
    public String handleGetAll() {
        return "admin/product/table-page";
    }

}
