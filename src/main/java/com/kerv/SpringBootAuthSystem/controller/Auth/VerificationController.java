package com.kerv.SpringBootAuthSystem.controller.Auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/OTP-verification")
public class VerificationController {

    /**
     *
     * @return
     */
    @GetMapping("/verification")
    private String verification() {
        return "auth/OTP-Verification";
    }

}
