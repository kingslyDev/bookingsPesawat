package model;

public class Booking {
    private int bookingId;
    private int userId;
    private int ticketId;
    private String boardingCode;
    private String seatNumber;

    // Constructor
    public Booking(int bookingId, int userId, int ticketId, String boardingCode, String seatNumber) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.ticketId = ticketId;
        this.boardingCode = boardingCode;
        this.seatNumber = seatNumber;
    }

    // Getter dan Setter
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getBoardingCode() {
        return boardingCode;
    }

    public void setBoardingCode(String boardingCode) {
        this.boardingCode = boardingCode;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    // Metode untuk menampilkan informasi pemesanan
    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", userId=" + userId +
                ", ticketId=" + ticketId +
                ", boardingCode='" + boardingCode + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                '}';
    }
}
