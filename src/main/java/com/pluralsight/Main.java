package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(125, false, true, 3);
        System.out.println(room1);

        Room room2 = new Room();
        room2.setNumberOfBeds(4);
        room2.setPrice(1000);
        room2.setOccupied(false);
        room2.setDirty(false);
        System.out.println(room2);
        room2.checkedIn();
        room2.checkOut();
        room2.cleanRoom();

        room1.cleanRoom();
        System.out.println(room1);



        Reservation reservation = new Reservation("king", 50, true);
        System.out.println(reservation);

        Reservation reservation1 = new Reservation();
        reservation1.setNumberOfNights(10);
        reservation1.setWeekend(true);
        reservation1.setRoomType("double");
        System.out.println(reservation1);


        Employee employee = new Employee(1234, "Jolie", "PM", 55.6, 50);
        System.out.println(employee);

        Employee employee1 = new Employee();
        employee1.setEmployeeId(1234);
        employee1.setName("Jolie Nguyen");
        employee1.setDepartment("BOM");
        employee1.setPayRate(100.10);
        employee1.setHoursWorked(40);
        System.out.println(employee1);

//        employee.punchIn(10);
//        employee.punchOut(20);
//        System.out.println(employee);
        employee.punchInOut(20,10);
        System.out.println(employee);
        employee.punchIn();
        employee.punchOut();
        System.out.println(employee);


    }
}
