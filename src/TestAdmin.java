import java.util.Scanner;

public class TestAdmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // สร้างผู้ใช้และแอดมิน
        User user = new User("ADMIN");
        Admin admin = new Admin(user); // สร้าง object ของแอดมิน และกำหนดผู้ใช้ที่ต้องการตรวจสอบ

        System.out.println("====All reservation for the user====");

        // ค้นหาการจองโดยใช้เลขโต๊ะ
        System.out.print("Enter table number to search booking: ");
        String tableNumber = input.next();

        System.out.print("Enter check a day: ");
        String newBookingDate = input.next();

        //ตรวจสอบการจอง
        admin.isSameBookingDate(tableNumber, newBookingDate);
        // ค้นหาการจองจากหมายเลขโต๊ะ
        admin.searchBooking(tableNumber);

    }
}
