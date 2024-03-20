
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("-----------------------------------\n" +  // Main Menu
                "        ชื่อร้าน\n" +
                "-----------------------------------\n" +
                "1. Booking\n" +
                "2. Check your booking(Admin)\n" +
                "3. Exit\n" +
                "-------------------\n" +
                "Enter Number : ");
        String firstCheck = input.next();

        switch (firstCheck) {
            case "1":
              Booking();

        }
    }
    public static void Booking() {

        Scanner input = new Scanner(System.in);

        Table[] vipTable = new Table[15];
        vipTable[0] = new Table("101", "VIP");
        vipTable[1] = new Table("102", "VIP");
        vipTable[2] = new Table("103", "VIP");
        vipTable[3] = new Table("104", "VIP");
        vipTable[4] = new Table("105", "VIP");
        vipTable[5] = new Table("106", "VIP");
        vipTable[6] = new Table("107", "VIP");
        vipTable[7] = new Table("108", "VIP");
        vipTable[8] = new Table("109", "VIP");
        vipTable[9] = new Table("110", "VIP");
        vipTable[10] = new Table("111", "VIP");
        vipTable[11] = new Table("112", "VIP");
        vipTable[12] = new Table("113", "VIP");
        vipTable[13] = new Table("114", "VIP");
        vipTable[14] = new Table("115", "VIP");

        Table[] regularTable = new Table[20];
        regularTable[0] = new Table("201", "Regular");
        regularTable[1] = new Table("202", "Regular");
        regularTable[2] = new Table("203", "Regular");
        regularTable[3] = new Table("204", "Regular");
        regularTable[4] = new Table("205", "Regular");
        regularTable[5] = new Table("206", "Regular");
        regularTable[6] = new Table("207", "Regular");
        regularTable[7] = new Table("208", "Regular");
        regularTable[8] = new Table("209", "Regular");
        regularTable[9] = new Table("210", "Regular");
        regularTable[10] = new Table("211", "Regular");
        regularTable[11] = new Table("212", "Regular");
        regularTable[12] = new Table("213", "Regular");
        regularTable[13] = new Table("214", "Regular");
        regularTable[14] = new Table("215", "Regular");
        regularTable[15] = new Table("216", "Regular");
        regularTable[16] = new Table("217", "Regular");
        regularTable[17] = new Table("218", "Regular");
        regularTable[18] = new Table("219", "Regular");
        regularTable[19] = new Table("220", "Regular");

        String answer = "Y";

            // รับข้อมูลจากผู้ใช้
            System.out.print("Enter customer name:");
            String customerName = input.next();

            //กรอกวันที่ต้องการจอง
            System.out.print("Enter booking date (DD/MM/YYYY):");
            String bookingDate = input.next();

            //กรอกหมายเลขโทรศัพท์
            System.out.print("Enter phone number:");
            String phoneNumber = input.next();

        while (answer.split("")[0].equals("Y")) {
            // กรอกประเภทโต๊ะที่เลือก
            System.out.print("Enter table type (Vip Or Regular):");
            String tableType = input.next();


            // เช็คว่าค่าที่รับมาเป็นไทป์ไหน
            System.out.println("---Available tables---");
            if (tableType.equalsIgnoreCase("Vip")) {
                boolean check = false;
                String tableNumber;
                do {
                    for (Table vip : vipTable) {//ลูปแสดงหมายเลขโต๊ะทั้งหมดของอาร์เรย์นั้น
                        if (vip.isBooked()) {

                        } else {
                            System.out.println("Table number: " + vip.getTableNumber());
                        }
                    }
                    System.out.print("Choose a table number: ");
                    tableNumber = input.next();
                    for (Table vip : vipTable) {//ลูปแสดงหมายเลขโต๊ะทั้งหมดของอาร์เรย์นั้น
                        if (vip.getTableNumber().equals(tableNumber) && !vip.booked) {
                            check = true;
                            break;
                        }
                    }
                }while (!check);

                //แสดงรายละเอียดการจอง
                System.out.println();
                System.out.println("======Review information======");
                Reserve reserve = new Reserve(customerName, bookingDate, phoneNumber, tableType, tableNumber);
                reserve.displayReservationDetails();
                vipTable[Integer.parseInt(tableNumber.substring(1))-1].booked = true;

                while (!answer.equals("N")) {
                    System.out.print("Do you want to make another booking? (Y/N): ");
                    answer = input.next();
                    if(answer.equals("N") || answer.equals("Y")) {
                        break;
                    } else {
                        System.out.println("Please enter (Y/N)");
                    }
                }
            }else if (tableType.equalsIgnoreCase("Regular")) {
                boolean check = false;
                String tableNumber;
                do {
                    for (Table regular : regularTable) {//ลูปแสดงหมายเลขโต๊ะทั้งหมดของอาร์เรย์นั้น
                        if (regular.isBooked()) {

                        } else {
                            System.out.println("Table number: " + regular.getTableNumber());
                        }
                    }
                    System.out.print("Choose a table number: ");
                    tableNumber = input.next();
                    for (Table regular : regularTable) {//ลูปแสดงหมายเลขโต๊ะทั้งหมดของอาร์เรย์นั้น
                        if (regular.getTableNumber().equals(tableNumber) && !regular.booked) {
                            check = true;
                            break;
                        }
                    }
                }while (!check);

                //แสดงรายละเอียดการจอง
                System.out.println();
                System.out.println("======Review information======");
                Reserve reserve = new Reserve(customerName, bookingDate, phoneNumber, tableType, tableNumber);
                reserve.displayReservationDetails();
                regularTable[Integer.parseInt(tableNumber.substring(1))-1].booked = true;

                // เช็คว่าต้องการทำรายการจองต่อมั้ย
                while (!answer.equals("N")) {
                    System.out.print("Do you want to make another booking? (Y/N): ");
                    answer = input.next();
                    if(answer.equals("N") || answer.equals("Y")) {
                        break;
                    } else {
                        System.out.println("Please enter (Y/N)");
                    }
                }
            }
        }
        System.out.println("Thank you for using Seat Reservation System!");
    }

    public static void Admin() {

    }
}



