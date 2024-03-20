public class BookingDetail{
    private String bookingCode; //รหัสการจอง
    private String  tableNumber; //เลขที่นั่ง

    // กำหนดข้อมูลรายละเอียดการจองเมื่อสร้างอ็อบเจ็กต์
    public BookingDetail(String bookingCode, String tableNumber) {
        this.bookingCode = bookingCode;
        this.tableNumber = tableNumber;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    // เมธอดเพื่อแสดงข้อมูลรายละเอียดการจอง
    public void displayBookingDetails() {
        System.out.println("Booking details:");
        System.out.println("Booking Code: " + bookingCode);
        System.out.println("Table Number: " + tableNumber);
    }
}
