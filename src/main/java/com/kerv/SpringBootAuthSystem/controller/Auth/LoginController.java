package com.kerv.SpringBootAuthSystem.controller.Auth;

import com.kerv.SpringBootAuthSystem.repository.UserDAOInterface;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  // To return a Html page
@RequestMapping("/login")    // This class will be call when the mapping get requested
public class LoginController {

    private UserDAOInterface userDAOInterface;

    /**
     * Parametrized ControllerConstructor.
     * @param userDAOInterface
     */
    public LoginController(UserDAOInterface userDAOInterface) {
        this.userDAOInterface = userDAOInterface;
    }

    @GetMapping
    public String home() {
        return "redirect:/";
    }

}
