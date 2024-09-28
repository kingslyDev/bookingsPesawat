package model;

import java.util.Date;

public class Ticket {
    private String flightCode;
    private String departureCity;
    private String arrivalCity;
    private Date date; // Tanggal penerbangan
    private int availableSeats;
    private String planeImage; // URL atau path ke gambar pesawat

    // Constructor
    public Ticket(String flightCode, String departureCity, String arrivalCity, Date date, int availableSeats, String planeImage) {
        this.flightCode = flightCode;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.date = date;
        this.availableSeats = availableSeats;
        this.planeImage = planeImage;
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

    public String getPlaneImage() {
        return planeImage;
    }

    public void setPlaneImage(String planeImage) {
        this.planeImage = planeImage;
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
                ", planeImage='" + planeImage + '\'' +
                '}';
    }
}
