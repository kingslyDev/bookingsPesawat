/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project_tiket_pesawat;

/**
 *
 * @author angelica
 */
public class Main {

    public static void main(String[] args) {
        User penumpang = new User("Angelica", "angel", "password123");

        // Test login with admin credentials
        String adminUsername = "admin";
        String adminPassword = "12345";
        
        if (penumpang.validateLogin(adminUsername, adminPassword)) {
            System.out.println("Admin login successful!");
        } else {
            System.out.println("Invalid admin username or password.");
        }
    }
}
