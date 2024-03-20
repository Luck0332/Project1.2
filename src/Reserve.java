import java.util.ArrayList;
import java.util.List;

public class Reserve {
    private String customerName; // ชื่อลูกค้า
    private String bookingDate; // วันที่ต้องการจอง
    private String phoneNumber; // เบอร์โทรศัพท์
    private String tableType; // ประเภทโต๊ะ
    private String tableNumber; //หมายเลขโต๊ะ
    private List<BookingDetail> bookingDetailList;

    // กำหนดข้อมูลการจองเมื่อสร้างอ็อบเจ็กต์
    public Reserve(String customerName, String bookingDate, String phoneNumber, String tableType, String tableNumber) {
        this.customerName = customerName;
        this.bookingDate = bookingDate;
        this.phoneNumber = phoneNumber;
        this.tableType = tableType;
        this.tableNumber = tableNumber;
        this.bookingDetailList = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }


    // เมธอดเพื่อแสดงข้อมูลการจอง
    public void displayReservationDetails() {
        System.out.println("Reservation details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Booking Date: " + bookingDate);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Table Type: " + tableType);
        System.out.println("Table Number: " + tableNumber);
    }
}
