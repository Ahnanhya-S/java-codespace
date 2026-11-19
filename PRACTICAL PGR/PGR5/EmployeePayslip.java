import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double basicSalary;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        name = sc.nextLine();

        System.out.print("Basic Salary: ");
        basicSalary = sc.nextDouble();
    }

    void displayDetails() {
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: Rs " + basicSalary);
    }
}

class Payslip extends Employee {

    void displayPayslip() {
        double hra = basicSalary * 0.2;
        double da = basicSalary * 0.1;
        double gross = basicSalary + hra + da;

        System.out.println("HRA: Rs " + hra);
        System.out.println("DA: Rs " + da);
        System.out.println("Gross Salary: Rs " + gross);
    }
}

public class EmployeePayslip {
    public static void main(String[] args) {

        Payslip emp = new Payslip();
        emp.getDetails();
        emp.displayDetails();
        emp.displayPayslip();
    }
}