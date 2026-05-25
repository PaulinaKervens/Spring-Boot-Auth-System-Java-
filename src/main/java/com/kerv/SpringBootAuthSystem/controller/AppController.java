package com.kerv.SpringBootAuthSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 */
@Controller         // To return a Html page
@RequestMapping("/")
public class AppController {

    /**
     * Method that print the login.html page, the start mapping point.
     * @param model The model
     * @return A method that return a String.
     */
    @GetMapping("/")
    public String index(Model model) {
        return "auth/login";     // Return the index.html page
    }

    @GetMapping("/user/home")
    public String user_home() {
        return "user/home";
    }


}
