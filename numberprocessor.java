import java.util.Scanner;

public class numberprocessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Choose an operation:");
        System.out.println("1. Sort");
        System.out.println("2. Sum");
        System.out.println("3. Average");
        System.out.println("4. Product");
        System.out.println("5. Factorial of Each Element");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                sortingalgorithms.bubbleSort(arr);
                System.out.println("Sorted array:");
                printArray(arr);
                break;

            case 2:
                System.out.println("Sum = " + Arrayutils.sum(arr));
                break;

            case 3:
                System.out.println("Average = " + Arrayutils.average(arr));
                break;

            case 4:
                System.out.println("Product = " + Arrayutils.product(arr));
                break;

            case 5:
                long[] facts = Arrayutils.factorial(arr);
                System.out.println("Factorials:");
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i] + "! = " + facts[i]);
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }

    private static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
