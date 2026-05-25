package com.kerv.SpringBootAuthSystem.controller.Auth;

import com.kerv.SpringBootAuthSystem.model.User;
import com.kerv.SpringBootAuthSystem.repository.UserDAOInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/register")
public class RegisterController {

    private UserDAOInterface userDAOInterface;

    /**
     * Parametrized ControllerConstructor.
     * @param userDAOInterface
     */
    public RegisterController(UserDAOInterface userDAOInterface) {
        this.userDAOInterface = userDAOInterface;
    }


    @GetMapping
    public String showRegisterPage() {
        return "auth/register";
    }

    @PostMapping
    public String submitRegisterForm(@RequestParam String email,
                                     @RequestParam String phone,
                                     @RequestParam String firstname,
                                     @RequestParam String lastname,
                                     @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateOfBirth,
                                     @RequestParam String password,
                                     Model model) {


        User user = User.builder()
                .username(email).email(email).emailVerified(false)
                .phone(phone).firstname(firstname)
                .lastname(lastname).dateOfBirth(dateOfBirth)
                .passwordHash(password).createdAt(LocalDateTime.now())
                .Enum("USER").enabled(true)
                .build();



        // Save the data
        userDAOInterface.save(user);

        model.addAttribute("success", "success");
        model.addAttribute("message", "A new Activity has been added to the tracker app.");

        return "redirect:/login";
    }



}
