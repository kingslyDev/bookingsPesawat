/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_tiket_pesawat;

/**
 *
 * @author angelica
 */
public class User {
    private String name;
    private String username;
    private String password;

    // Constructor to initialize the User object
    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    // Method to validate login credentials
    public boolean validateLogin(String inputUsername, String inputPassword) {
        // Check for admin credentials
        if (inputUsername.equals("admin") && inputPassword.equals("12345")) {
            return true; // Admin login successful
        }
        // Check for regular user credentials
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    // Method to display user information
    public String InformasiUser() {
        return "Name: " + name + ", Username: " + username;
    }
}
