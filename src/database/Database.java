package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/planetikcet"; // Ganti sesuai dengan nama database Anda
    private static final String USER = "root"; // Ganti jika username Anda berbeda
    private static final String PASSWORD = ""; // Ganti jika ada password

    // Metode untuk mendapatkan koneksi
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Mencoba untuk mendapatkan koneksi ke database
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Koneksi ke database berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return connection;
    }

    // Metode utama untuk menguji koneksi
    public static void main(String[] args) {
        Connection conn = Database.getConnection();
        
        // Lakukan operasi yang diinginkan di sini

        // Menutup koneksi
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Koneksi ditutup.");
            }
        } catch (SQLException e) {
            System.out.println("Gagal menutup koneksi: " + e.getMessage());
        }
    }
}
