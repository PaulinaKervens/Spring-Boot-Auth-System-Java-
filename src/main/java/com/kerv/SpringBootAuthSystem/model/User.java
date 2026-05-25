package com.kerv.SpringBootAuthSystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * User Class Implementation
 */
@Entity
@Table(name = "users")       // To create the table with that name
@Getter                     // Generate default setters for all fields via Lombok
@Setter                     // Generate default getters for all fields via Lombok
@NoArgsConstructor          // Generate default constructor via Lombok
@AllArgsConstructor         // Generate parametrized constructor via Lombok
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;        // For the user id

    @Email
    @NotBlank
    @Column(nullable = false, unique = true)
    private String email;       // The user email

    @NotNull
    @Column(nullable = false)
    private Boolean emailVerified = false;      // To know if the email used is a used one and actually for the user

    @NotBlank
    @Column(nullable = false, unique = true)
    private String phone;       // The user contact phone

    @NotBlank
    @Column(nullable = false, unique = true)
    private String username;        // User username, can be used in preference of email to log in

    @NotBlank
    @Column(nullable = false)
    private String firstname;   // User firstname

    @NotBlank
    @Column(nullable = false)
    private String lastname;    // User lastname

    @NotNull
    @Column(nullable = false)
    private LocalDate dateOfBirth;  // User date of birth for some contraint of age

    @NotBlank
    @Column(nullable = false)
    private String passwordHash;    // The user password hashed

    @NotNull
    @Column(nullable = false)
    private LocalDateTime createdAt;        // The time and date when the user create the account

    /**
     * The user status could be Admin - Simple user - Supervisor
     * The enum will be by default user
     * Only Admin can set a user to admin or supervisor
     * A sup can block a user
     */
    @NotBlank
    @Column(nullable = false)
    private String Enum;    // Account status(Sup - User - Admin)

    /**
     * Active : The account is free to use anytime.
     * Deactivate : The account might be deactivated (permanently or temporary)
     */
    @NotNull
    @Column(nullable = false)
    private Boolean enabled = true;

}