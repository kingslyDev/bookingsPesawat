package controller;

import model.Ticket;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import database.Database;

public class TicketController {

    // Method untuk menambahkan tiket baru
    public boolean addTicket(Ticket ticket) {
        String sql = "INSERT INTO tickets (flightCode, departureCity, arrivalCity, date, availableSeats, ticketStatus) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, ticket.getFlightCode());
            pstmt.setString(2, ticket.getDepartureCity());
            pstmt.setString(3, ticket.getArrivalCity());
            pstmt.setDate(4, new java.sql.Date(ticket.getDate().getTime())); // Konversi Date ke java.sql.Date
            pstmt.setInt(5, ticket.getAvailableSeats());
            pstmt.setString(6, ticket.getTicketStatus());
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
        String sql = "SELECT * FROM tickets WHERE flightCode = ? AND departureCity = ? AND arrivalCity = ?";
        try (Connection conn = Database.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, flightCode);
            pstmt.setString(2, departureCity);
            pstmt.setString(3, arrivalCity);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                // Membuat objek Ticket dari hasil query
                Ticket ticket = new Ticket(
                        rs.getString("flightCode"),
                        rs.getString("departureCity"),
                        rs.getString("arrivalCity"),
                        rs.getDate("date"),
                        rs.getInt("availableSeats"),
                        rs.getString("ticketStatus")
                );
                tickets.add(ticket); // Menambahkan tiket ke list
            }
        } catch (SQLException e) {
            System.out.println("Error searching tickets: " + e.getMessage());
        }
        return tickets; // Mengembalikan daftar tiket yang ditemukan
    }
}
