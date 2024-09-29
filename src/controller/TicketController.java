package controller;

import model.Ticket;
import database.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TicketController {

    // Method untuk menambahkan tiket baru
    public boolean addTicket(Ticket ticket) {
        String sql = "INSERT INTO flights (flight_code, departure_date, departure_city, arrival_city, ticket_status, total_tickets) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, ticket.getFlightCode());
            pstmt.setDate(2, new java.sql.Date(ticket.getDate().getTime())); // Konversi Date ke java.sql.Date
            pstmt.setString(3, ticket.getDepartureCity());
            pstmt.setString(4, ticket.getArrivalCity());
            pstmt.setString(5, ticket.getTicketStatus());
            pstmt.setInt(6, ticket.getAvailableSeats()); // Menyimpan availableSeats sebagai total_tickets

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0; // Mengembalikan true jika tiket berhasil ditambahkan
        } catch (SQLException e) {
            System.out.println("Error adding ticket: " + e.getMessage());
            return false; // Mengembalikan false jika terjadi kesalahan
        }
    }

    // Method untuk mencari tiket berdasarkan kriteria tertentu
    public List<Ticket> searchTickets(String flightCode, String departureCity, String arrivalCity) {
        List<Ticket> tickets = new ArrayList<>();
        String sql = "SELECT * FROM flights WHERE flight_code = ? AND departure_city = ? AND arrival_city = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, flightCode);
            pstmt.setString(2, departureCity);
            pstmt.setString(3, arrivalCity);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                // Membuat objek Ticket dari hasil query
                Ticket ticket = new Ticket(
                        rs.getString("flight_code"),
                        rs.getString("departure_city"),
                        rs.getString("arrival_city"),
                        rs.getDate("departure_date"),
                        rs.getInt("total_tickets"), // Menggunakan total_tickets sebagai availableSeats
                        rs.getString("ticket_status")
                );
                tickets.add(ticket); // Menambahkan tiket ke list
            }
        } catch (SQLException e) {
            System.out.println("Error searching tickets: " + e.getMessage());
        }
        return tickets; // Mengembalikan daftar tiket yang ditemukan
    }
}
