package com.pluralsight;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee() {

    }

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours() {
        if (getHoursWorked() <= 40) {
            return getHoursWorked();
        } else {
            return 40;
        }
    }

    public double getOvertimeHours() {
        if (getHoursWorked()> 40) {
            return getHoursWorked() - 40;
        } else {
            return 0;
        }
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * getPayRate();
        double overtimePay = getOvertimeHours() * 1.5 * getPayRate();
        return regularPay + overtimePay;
    }
    private static int punchInTime = 0;
    public void punchIn(int time) {
        punchInTime = time;
    }
    public void punchOut(int time){
        double workTime = time - punchInTime;
        hoursWorked +=workTime;
    }
    public void punchInOut(int inTime, int outTime){
        int punchInTime;
        if (outTime> inTime) {
            punchInTime = outTime - inTime;
            hoursWorked += punchInTime;
        }
    }
    public void punchIn(){
        punchInTime = LocalDateTime.now().getHour();
        System.out.println("Punched in at: " + punchInTime);
    }
    public void punchOut(){
        int punchOutTime = LocalDateTime.now().getHour();
        int workTime = punchOutTime - punchInTime;
        System.out.println("Punched in at: " + punchOutTime);
        hoursWorked += workTime;
    }





    @Override
    public String toString() {
        return "employeeId = " + employeeId +
                ", name = '" + name + '\'' +
                ", department = '" + department + '\'' +
                ", payRate = " + payRate +
                ", hoursWorked = " + hoursWorked +
                ", totalPay = " + getTotalPay();
    }
}
