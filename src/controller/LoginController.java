/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.Database;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import view.Admin.AdminMainPage;
import view.User.UserMainPage;

/**
 *
 * @author tango
 */
public class LoginController {
     public void login(String username, String password, JFrame currentFrame) {
        // Mendapatkan koneksi ke database
        Connection conn = Database.getConnection();
        
        if (conn != null) {
            try {
                // SQL untuk memeriksa pengguna
                String sql = "SELECT role FROM users WHERE username = ? AND password = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, username);
                pstmt.setString(2, password);

                // Menjalankan query
                ResultSet rs = pstmt.executeQuery();
                
                // Memeriksa apakah ada hasil
                if (rs.next()) {
                    String role = rs.getString("role");

                    // Arahkan ke halaman yang sesuai berdasarkan role
                    if ("customer".equals(role)) {
                        currentFrame.dispose(); // Menutup halaman login
                        UserMainPage userMainPage = new UserMainPage();
                        userMainPage.setVisible(true);
                    } else if ("admin".equals(role)) {
                        currentFrame.dispose(); // Menutup halaman login
                        AdminMainPage adminMainPage = new AdminMainPage();
                        adminMainPage.setVisible(true);
                    }
                } else {
                    // Username atau password salah
                    JOptionPane.showMessageDialog(currentFrame, "Username atau Password salah!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                System.err.println("Kesalahan SQL: " + e.getMessage());
            } finally {
                try {
                    conn.close(); // Pastikan koneksi ditutup
                } catch (SQLException e) {
                    System.err.println("Gagal menutup koneksi: " + e.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(currentFrame, "Gagal terhubung ke database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
