package test;

import model.*;

import java.time.LocalDate;
import java.util.ArrayList;


public class MainTest {
    public static void main(String[] args) {
        MonthlyEmployee manager = new MonthlyEmployee(1, "Ahmed Ali", Gender.MALE,
                LocalDate.of(2015, 3, 1), 20000, 21, 15, true);
        CommissionEmployee seller = new CommissionEmployee(2, "Sara Hassan", Gender.FEMALE,
                LocalDate.of(2020, 6, 15), 5000, 0.05, 80000);
        HourlyEmployee worker = new HourlyEmployee(3, "Omar Khaled", Gender.MALE,
                LocalDate.of(2022, 1, 10), 50, 180, 80);

        Department dept = new Department(10, "Sales", manager, new ArrayList<>());
        dept.addEmployee(manager);
        dept.addEmployee(seller);
        dept.addEmployee(worker);

        System.out.println(dept);
        dept.printAllEmployees();

        System.out.println("\nSalaries:");
        System.out.println(manager.getName() + " -> " + manager.calculateSalary());
        System.out.println(seller.getName() + " -> " + seller.calculateSalary()
                + " (commission " + seller.calculateCommission() + ")");
        System.out.println(worker.getName() + " -> " + worker.calculateSalary());
        System.out.println("Additional vacation for manager: "
                + manager.calculateAdditionalVacation() + " days");

        System.out.println("\nTotal payroll: " + dept.calculateTotalPayroll());

        System.out.println("\nFind employee 2: " + dept.findEmployee(2).getName());
        dept.removeEmployee(2);
        System.out.println("After removing employee 2, payroll: " + dept.calculateTotalPayroll());
        dept.printAllEmployees();
    }
}
