public class Arrayutils {

    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    public static double average(int[] arr) {
        if (arr.length == 0) return 0;
        return (double) sum(arr) / arr.length;
    }

    public static int product(int[] arr) {
        int result = 1;
        for (int num : arr) {
            result *= num;
        }
        return result;
    }

    public static long[] factorial(int[] arr) {
        long[] result = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = factorialOf(arr[i]);
        }
        return result;
    }

    private static long factorialOf(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
