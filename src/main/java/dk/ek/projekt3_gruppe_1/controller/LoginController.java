package dk.ek.projekt3_gruppe_1.controller;

import dk.ek.projekt3_gruppe_1.repo.UserRepo;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/")
    public String loginStart(Model model, @RequestParam(name = "loginError", defaultValue = "false") boolean loginError){
        //List<User> listOfUsers = userRepo.getAllUsers();
        //model.addAttribute("listOfUsers", listOfUsers);
        model.addAttribute("loginError", loginError);
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session) {
        Integer userId = userRepo.findUserIdByCredentials(username, password);
        String role = userRepo.findRoleByCredentials(username, password);
        if (userId == null || role.isEmpty()) {
            return "redirect:/index?loginError=true";
        }

        session.setAttribute("userID", userId);
        session.setAttribute("role", role);
        return "redirect:/index";
    }
}
