package model;

import java.util.Date;

public class Ticket {
    private String flightCode;
    private String departureCity;
    private String arrivalCity;
    private Date date; // Tanggal penerbangan
    private int availableSeats;
    private String ticketStatus; // Status tiket

    // Constructor
    public Ticket(String flightCode, String departureCity, String arrivalCity, Date date, int availableSeats, String ticketStatus) {
        this.flightCode = flightCode;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.date = date;
        this.availableSeats = availableSeats;
        this.ticketStatus = ticketStatus; // Status tiket
    }

    // Getter dan Setter
    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    // Metode untuk menampilkan informasi tiket
    @Override
    public String toString() {
        return "Ticket{" +
                "flightCode='" + flightCode + '\'' +
                ", departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", date=" + date +
                ", availableSeats=" + availableSeats +
                ", ticketStatus='" + ticketStatus + '\'' +
                '}';
    }
}
