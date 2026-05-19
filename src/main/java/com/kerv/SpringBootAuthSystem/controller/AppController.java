package com.kerv.SpringBootAuthSystem.controller;

import com.kerv.SpringBootAuthSystem.repository.UserDAOInterface;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 */
@Controller         // To return a Html page
public class AppController {
    private UserDAOInterface userDAOInterface;

    /**
     *
     * @param userDAOInterface
     */
    public AppController(UserDAOInterface userDAOInterface) {
        this.userDAOInterface = userDAOInterface;
    }


    /**
     * Method that print the login.html page, the start mapping point.
     * @param model The model
     * @return A method that return a String.
     */
    @GetMapping("/")
    public String index(Model model) {
        return "auth/login";     // Return the index.html page
    }

    @GetMapping("/log-in")
    public String home() {
        return "redirect:/";
    }

    @GetMapping("/register")
    public String register(Model model) {
        return "auth/register";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        return "auth/register";
    }

    @GetMapping("/user/home")
    public String user_home() {
        return "user/home";
    }

}
