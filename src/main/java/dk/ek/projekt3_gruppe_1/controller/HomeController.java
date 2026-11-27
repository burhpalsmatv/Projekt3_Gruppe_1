package dk.ek.projekt3_gruppe_1.controller;

import dk.ek.projekt3_gruppe_1.model.User;
import dk.ek.projekt3_gruppe_1.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    UserRepo userRepo;




    @GetMapping("/index")
    public String homepage() {
        return "index";
    }
}
