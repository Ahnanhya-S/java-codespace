import java.util.*;

public class SortSearchDemo {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter the values:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        Thread sortThread = new Thread(() -> {
            Arrays.sort(arr);
            System.out.println("Sorted: " + Arrays.toString(arr));
        });

        Thread searchThread = new Thread(() -> {
            int index = -1;
            for (int i = 0; i < arr.length; i++)
                if (arr[i] == key) {
                    index = i;
                    break;
                }

            if (index != -1)
                System.out.println("Found at index " + index);
            else
                System.out.println("Not found");
        });

        sortThread.start();
        sortThread.join();   // ensures sorting completes first
        searchThread.start();

        sc.close();
    }
}