import java.util.Scanner;

class Employee {
    double calculateBonus(double salary) {
        return 0;
    }
}

class Manager extends Employee {
    @Override
    double calculateBonus(double salary) {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    @Override
    double calculateBonus(double salary) {
        return salary * 0.15;
    }
}

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee emp;

        System.out.println("Enter Employee Type (Manager / Developer): ");
        String type = sc.nextLine();

        System.out.println("Enter Salary: ");
        double salary = sc.nextDouble();

        if (type.equalsIgnoreCase("Manager")) {
            emp = new Manager();
        } else if (type.equalsIgnoreCase("Developer")) {
            emp = new Developer();
        } else {
            System.out.println("Invalid Employee Type");
            sc.close();
            return;
        }

        double bonus = emp.calculateBonus(salary);
        System.out.println("Bonus Amount: " + bonus);

        sc.close();
    }
}
