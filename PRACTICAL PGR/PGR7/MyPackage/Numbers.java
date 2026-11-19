package MyPackage;

public class Numbers {

    public void calculate(int a, int b, int c) {
        int max = a;
        int min = a;

        if (b > max) max = b;
        if (c > max) max = c;

        if (b < min) min = b;
        if (c < min) min = c;

        int avg = (a + b + c) / 3;

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Average = " + avg);
    }
}

