package dk.ek.projekt3_gruppe_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    public HomeController() {}

    @GetMapping("/index")
    public String homepage() {
        return "index";
    }
}
