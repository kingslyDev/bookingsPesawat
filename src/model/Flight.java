/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
/**
 *
 * @author tango
 */
public class Flight {
      private String flightCode;
    private Date departureDate;
    private String departureCity;
    private String arrivalCity;
    private int totalTickets;
    private String ticketStatus;

    public Flight(String flightCode, Date departureDate, String departureCity, String arrivalCity, int totalTickets, String ticketStatus) {
        this.flightCode = flightCode;
        this.departureDate = departureDate;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.totalTickets = totalTickets;
        this.ticketStatus = ticketStatus;
    }
    
    public String getFlightCode() { return flightCode; }
    public Date getDepartureDate() { return departureDate; }
    public String getDepartureCity() { return departureCity; }
    public String getArrivalCity() { return arrivalCity; }
    public int getTotalTickets() { return totalTickets; }
    public String getTicketStatus() { return ticketStatus; }
}
