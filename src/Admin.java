import java.util.List;

public class Admin extends User{
    private User user;
    private List<Table> tables;

    // เมธอดเพื่อกำหนดผู้ใช้ที่จะตรวจสอบเมื่อสร้างอ็อบเจ็กต์
    public Admin(User user) {
        super();
        this.user = user;
    }

    public Admin(List<Table> tables) {
        super();
        this.tables = tables;
    }

    public boolean validateInput(String input) {
        // ในที่นี้เราจะตรวจสอบเฉพาะเลขโต๊ะเท่านั้น
        // โดยเลขโต๊ะควรเป็นตัวเลขเท่านั้น และมีความยาวไม่เกิน 3 ตัวอักษร
        return input.matches("\\d{1,3}");
    }

    // เมธอดเพื่อแสดงข้อมูลการจองของผู้ใช้ที่ถูกตรวจสอบ
    public void displayUserReservations() {
        user.displayReservations();
    }

    // เมธอดสำหรับแสดงรายการการจองทั้งหมด
    public void displayAllBookings() {
        System.out.println("All bookings: ");
        for (Table table : tables) {
            table.displayBookings();
        }
    }

    // เมธอดสำหรับค้นหาการจองโดยใช้เลขโต๊ะ
    public void searchBooking(String tableNumber) {
        // รับเลขโต๊ะด้วยเมธอด validateInput ถ้าข้อมูลที่รับเข้ามาไม่ถูกต้องให้ปริ้นตามนั้น
        if (!validateInput(tableNumber)) {
            System.out.println("Invalid table number format.");
            return; //สิ้นสุดการทำงาน
        }
        //ดึงรายการจองทั้งหมดของผู้ใช้ และเก็บไว้ใน reservations
        List<Reserve> reservations = user.getReservations();
        //  สร้างลูป ตรวจสอบว่าเลขโต๊ะของการจองตรงกับเลขที่รับเข้ามามั้ย
        boolean found = false;
        for (Reserve reserve : reservations) {
            if (reserve.getTableType().equals(tableNumber)) {
                reserve.displayReservationDetails(); // แสดงรายละเอียดการจอง
                found = true; //ถ้าตรง กำหนดค่า found เป็น true
            }
        }
        if (!found) { //ถ้าหาแล้วไม่ตรงกับเลขที่รับเข้ามา
            System.out.println("No booking found for table number " + tableNumber);
        }
    }

    public boolean isSameBookingDate(String tableNumber, String newBookingDate) {
        List<Reserve> reservations = user.getReservations();

        for (Reserve reservation : reservations) {
            if (reservation.getTableNumber().equals(tableNumber) && reservation.getBookingDate().equals(newBookingDate));
            return true; // คืนค่า เมื่อพบการจองที่ตรงกับเงื่อนไข
        }
        return false; //คืนค่า false เมื่อไม่พบการจองที่ตรงกับเงื่อนไข
    }
}

