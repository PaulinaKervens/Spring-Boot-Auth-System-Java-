package com.kerv.SpringBootAuthSystem.controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin-dashboard")
public class DashboardController {

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        return "auth/register";
    }

}
