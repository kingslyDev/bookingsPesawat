/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Flight;
import database.Database; 
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author tango
 */
public class FlightController {
     private final Connection connection;

    public FlightController() {
        connection = Database.getConnection();
    }
    
    public List<Flight> getAllFlights() {
        List<Flight> flights = new ArrayList<>();
        String query = "SELECT flight_code, departure_date, departure_city, arrival_city, total_tickets, ticket_status FROM flights WHERE ticket_status = 'available'";
        
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
             
            while (rs.next()) {
                String flightCode = rs.getString("flight_code");
                Date departureDate = rs.getDate("departure_date");
                String departureCity = rs.getString("departure_city");
                String arrivalCity = rs.getString("arrival_city");
                int totalTickets = rs.getInt("total_tickets");
                String ticketStatus = rs.getString("ticket_status");

                Flight flight = new Flight(flightCode, departureDate, departureCity, arrivalCity, totalTickets, ticketStatus);
                flights.add(flight);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flights;
    }
    
}
