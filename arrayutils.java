package p2;
/**
 * ArrayUtils - Utility class for array operations
 * This class can be created in the array-operations branch
 * 
 * @author Your Name
 * @version 1.0
 */
public class arrayutils {
    
    /**
     * Find the maximum element in array
     * 
     * @param arr Input array
     * @return Maximum value in array
     */
    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    /**
     * Find the minimum element in array
     * 
     * @param arr Input array
     * @return Minimum value in array
     */
    public static int findMin(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
    /**
     * Find second highest element without using built-in functions
     * 
     * @param arr Input array
     * @return Second highest value
     */
    public static int findSecondHighest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }
        
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }
        
        if (secondHighest == Integer.MIN_VALUE) {
            // All elements are the same
            return highest;
        }
        
        return secondHighest;
    }
    
    /**
     * Find second lowest element without using built-in functions
     * 
     * @param arr Input array
     * @return Second lowest value
     */
    public static int findSecondLowest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }
        
        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;
        
        for (int num : arr) {
            if (num < lowest) {
                secondLowest = lowest;
                lowest = num;
            } else if (num < secondLowest && num != lowest) {
                secondLowest = num;
            }
        }
        
        if (secondLowest == Integer.MAX_VALUE) {
            // All elements are the same
            return lowest;
        }
        
        return secondLowest;
    }
    
    /**
     * Copy array elements to a new array
     * 
     * @param source Source array
     * @return New array with copied elements
     */
    public static int[] copyArray(int[] source) {
        int[] copy = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            copy[i] = source[i];
        }
        return copy;
    }
    
    /**
     * Display array elements in a formatted way
     * 
     * @param arr Array to display
     * @param title Title for the array display
     */
    public static void displayArray(int[] arr, String title) {
        System.out.println("\n" + title + ":");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    /**
     * Check if array contains duplicate values
     * 
     * @param arr Input array
     * @return true if duplicates exist, false otherwise
     */
    public static boolean hasDuplicates(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Calculate sum of all elements in array
     * 
     * @param arr Input array
     * @return Sum of all elements
     */
    public static long calculateSum(int[] arr) {
        long sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    
    /**
     * Calculate average of all elements in array
     * 
     * @param arr Input array
     * @return Average value
     */
    public static double calculateAverage(int[] arr) {
        if (arr.length == 0) {
            return 0.0;
        }
        return (double) calculateSum(arr) / arr.length;
    }
    
    /**
     * Display array statistics
     * 
     * @param arr Input array
     */
    public static void displayStatistics(int[] arr) {
        System.out.println("\n=== Array Statistics ===");
        System.out.println("Length: " + arr.length);
        System.out.println("Sum: " + calculateSum(arr));
        System.out.println("Average: " + String.format("%.2f", calculateAverage(arr)));
        System.out.println("Maximum: " + findMax(arr));
        System.out.println("Minimum: " + findMin(arr));
        System.out.println("Has Duplicates: " + (hasDuplicates(arr) ? "Yes" : "No"));
        
        if (arr.length >= 2) {
            System.out.println("Second Highest: " + findSecondHighest(arr));
            System.out.println("Second Lowest: " + findSecondLowest(arr));
        }
    }
}