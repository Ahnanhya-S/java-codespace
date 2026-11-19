public class MultipleCatchDemo{
public static void main(String[] args) {

try {
int a = 10;
int b = 0;
int result = a / b; 
System.out.println("Result: " + result);

int[] arr = {1, 2, 3};
System.out.println("Accessing 5th element: " + arr[4]); 

} catch (ArithmeticException e) {
System.out.println("Arithmetic Exception caught: Division by zero is not allowed.");

} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Array Index Exception caught: Invalid array index accessed.");

} catch (Exception e) {
System.out.println("General Exception caught: " + e);
}

System.out.println("Program continues after handling exceptions...");
}
}