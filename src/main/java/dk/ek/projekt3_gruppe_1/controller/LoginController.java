package dk.ek.projekt3_gruppe_1.controller;

import dk.ek.projekt3_gruppe_1.repo.UserRepo;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LoginController {

    @Autowired
    UserRepo userRepo;

    @GetMapping({"/", "/login"})
    public String login(Model model,
                        @RequestParam(name = "loginError", defaultValue = "false") boolean loginError) {

        model.addAttribute("loginError", loginError);
        return "login";
    }


    @PostMapping("/login")
    public String login(Model model,
                        @RequestParam String username,
                        @RequestParam String password,
                        HttpSession session,
                        @RequestParam(name = "loginError", defaultValue = "false") boolean loginError) {
        model.addAttribute("loginError", loginError);
        Integer userId = userRepo.findUserIdByCredentials(username, password);
        String role = userRepo.findRoleByCredentials(username, password);
        if (userId == null || role.isEmpty()) {
            return "redirect:/login?loginError=true";
        }

        session.setAttribute("userID", userId);
        session.setAttribute("role", role);
        return "redirect:/index";
    }
}
