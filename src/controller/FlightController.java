package controller;

import model.Flight;
import database.Database;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
                Flight flight = extractFlightFromResultSet(rs);
                flights.add(flight);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flights;
    }

    public List<String> getUniqueDepartureCities() {
        return getUniqueCities("departure_city");
    }

    public List<String> getUniqueArrivalCities() {
        return getUniqueCities("arrival_city");
    }

    private List<String> getUniqueCities(String cityType) {
        List<String> cities = new ArrayList<>();
        String query = "SELECT DISTINCT " + cityType + " FROM flights";

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                cities.add(rs.getString(cityType));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cities;
    }

    public List<Flight> getFilteredFlights(String departureCity, String arrivalCity, Date flightDate, int passengerCount) {
        List<Flight> flights = new ArrayList<>();
        String query = "SELECT flight_code, departure_date, departure_city, arrival_city, total_tickets, ticket_status " +
                       "FROM flights WHERE departure_city = ? AND arrival_city = ? AND departure_date = ? AND total_tickets >= ?";

        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setString(1, departureCity);
            pstmt.setString(2, arrivalCity);
            pstmt.setDate(3, flightDate);
            pstmt.setInt(4, passengerCount);

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Flight flight = extractFlightFromResultSet(rs);
                    flights.add(flight);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flights;
    }

    private Flight extractFlightFromResultSet(ResultSet rs) throws SQLException {
        String flightCode = rs.getString("flight_code");
        Date departureDate = rs.getDate("departure_date");
        String departureCity = rs.getString("departure_city");
        String arrivalCity = rs.getString("arrival_city");
        int totalTickets = rs.getInt("total_tickets");
        String ticketStatus = rs.getString("ticket_status");

        return new Flight(flightCode, departureDate, departureCity, arrivalCity, totalTickets, ticketStatus);
    }
}
