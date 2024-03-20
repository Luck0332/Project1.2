import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Reserve> reservations;
    public User() {
        username = "";
    }
    // กำหนดชื่อผู้ใช้เมื่อสร้างอ็อบเจ็กต์
    public User(String username) {
        this.username = username;
        this.reservations = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Reserve> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reserve> reservations) {
        this.reservations = reservations;
    }

    // เมธอดเพื่อเพิ่มการจองลงในรายการของผู้ใช้
    public void addReservation(Reserve reservation) {
        reservations.add(reservation);
    }

    // เมธอดแสดงรายการการจองทั้งหมดของผู้ใช้
    public void displayReservations() {
        System.out.println("Reservations for User " + username );
        for (Reserve reservation : reservations) {
            reservation.displayReservationDetails();
        }
    }
}
