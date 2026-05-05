package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Room room = new Room(125, false, true, 3);
        System.out.println(room);

        Reservation reservation = new Reservation("king", 50,true);
        System.out.println(reservation);

        Employee employee = new Employee(1234, "Jolie", "PM", 55.6,50);
        System.out.println(employee);

    }
}
