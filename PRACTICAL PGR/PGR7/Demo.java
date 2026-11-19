import MyPackage.Numbers;
import MyPackage.Factorial;
import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Numbers obj1 = new Numbers();
        obj1.calculate(a, b, c);

        System.out.println("\nEnter a number:");
        int n = sc.nextInt();

        Factorial obj2 = new Factorial();
        obj2.findFactorial(n);
    }
}
