package edu.citadel.hw1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class InheritanceDemo {
    public static void main(String[] args) {
        double totalPay = 0.0;

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new HourlyEmployee("John Doe", LocalDate.of(2009, 05, 21), 50.5, 160));
        employees.add(new HourlyEmployee("Jane Doe", LocalDate.of(2009, 9, 01), 150.5, 80));
        employees.add(new SalariedEmployee("Moe Howard", LocalDate.of(2004, 01, 01), 75000.0));
        employees.add(new SalariedEmployee("Curly Howard", LocalDate.of(2018, 01, 01), 105000.0));

        System.out.println("List of Employees (before sorting):");
        for (Object emp : employees) {
            System.out.println(emp);
        }
        System.out.println();

        Collections.sort(employees);

        System.out.println("List of Employees (after sorting):");
        for (Object emp : employees) {
            System.out.println(emp);
        }
        System.out.println();

        System.out.println("Monthly Pay:");
        for (Employee emp : employees) {
            System.out.printf("%s: $%, .2f%n", emp.getName(), emp.getMonthlyPay());
            totalPay += emp.getMonthlyPay();
        };
        System.out.printf("Total Monthly Pay: $%, .2f%n", totalPay);
    }
}
