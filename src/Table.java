import java.util.List;
import java.util.ArrayList;

public class Table {
    private String  tableNumber; // หมายเลขโต๊ะ
    private String typeTable; // ประเภทโต๊ะ
    private List<BookingDetail> bookings;
    public boolean booked; // ไว้เช็คว่าจองหรือยัง
    private String bookingDate; // วันที่จอง

    // กำหนดหมายเลขโต๊ะเมื่อสร้างอ็อบเจ็กต์
    public Table(String tableNumber, String typeTable) {
        this.tableNumber = tableNumber;
        this.typeTable = typeTable;
        this.bookings = new ArrayList<>();
        this.booked = false;
        this.bookingDate = "0000/00/00";
    }

    // เมธอดเพื่อเพิ่มรายละเอียดการจอง
    public void addBookingDetail(BookingDetail bookingDetail) {
        bookings.add(bookingDetail);
        this.booked = true; //เมื่อมีการจอง ให้เปลี่ยนสถานะการจองของโต๊ะเป็น true
    }

    // เมธอดเพื่อแสดงข้อมูลการจองทั้งหมด
    public void displayBookings() {
        System.out.println("Bookings for Table " + tableNumber );
        for (BookingDetail booking : bookings) {
            booking.displayBookingDetails();
        }
    }
    public String getTableNumber() {
        return tableNumber;
    }

    public String getTableType() {
        return typeTable;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getTypeTable() {
        return typeTable;
    }

    public void setTypeTable(String typeTable) {
        this.typeTable = typeTable;
    }

    public List<BookingDetail> getBookings() {
        return bookings;
    }

    public void setBookings(List<BookingDetail> bookings) {
        this.bookings = bookings;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public String getBookingDate() { // คืนค่า วันที่จอง
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Override
    public String toString() {
        return "Table number: " + tableNumber + ", Type: " + typeTable;
    }

    public boolean isBooked() {
        return booked;
    }
}
