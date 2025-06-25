package p2;

/**
 * @author Your Name
 * @version 1.0
 */
public class sortingalgorithms {
    
    /**
     * Bubble Sort Algorithm
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     * 
     * @param arr Array to be sorted
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            // If no swapping occurred, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
    
    /**
     * Selection Sort Algorithm
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     * 
     * @param arr Array to be sorted
     */
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            // Find the minimum element in remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the first element
            if (minIndex != i) {
                swap(arr, i, minIndex);
            }
        }
    }
    
    /**
     * Insertion Sort Algorithm
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     * 
     * @param arr Array to be sorted
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    
    /**
     * Utility method to swap two elements in an array
     * 
     * @param arr Array containing elements to swap
     * @param i Index of first element
     * @param j Index of second element
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    /**
     * Method to check if array is sorted
     * 
     * @param arr Array to check
     * @return true if sorted in ascending order, false otherwise
     */
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    
  
    public static void displayAlgorithmInfo() {
        System.out.println("Available Sorting Algorithms:");
        System.out.println("1. Bubble Sort - Simple but inefficient O(n²)");
        System.out.println("2. Selection Sort - Minimizes number of swaps O(n²)");
        System.out.println("3. Insertion Sort - Efficient for small datasets O(n²)");
    }
}