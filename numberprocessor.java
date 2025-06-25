package p2;

import java.util.Scanner;
/**
 * NumberProcessor - A program that processes an array of 5 numbers
 * Performs sorting and finds second highest/lowest values
 * 
 * @author Your Name
 * @version 1.0
 */
public class numberprocessor {
    
    private int[] numbers;
    private Scanner scanner;
    
    /**
     * Constructor initializes the array and scanner
     */
    public numberprocessor() {
        numbers = new int[5];
        scanner = new Scanner(System.in);
    }
    
    /**
     * Main method - entry point of the program
     */
    public static void main(String[] args) {
        numberprocessor processor = new numberprocessor();
        processor.run();
    }
    
    /**
     * Main program execution method
     */
    public void run() {
        System.out.println("=== Number Processor ===");
        System.out.println("Please enter 5 different numbers:");
        
        // Input numbers from user
        inputNumbers();
        
        // Display original array
        System.out.println("\nOriginal numbers:");
        displayArray();
        
        // Process the array
        processArray();
        
        // Close scanner
        scanner.close();
    }
    
    /**
     * Method to input 5 numbers from user
     */
    private void inputNumbers() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
    }
    
    /**
     * Method that performs sorting and finds second highest/lowest
     */
    public void processArray() {
        // Create a copy for sorting to preserve original
        int[] sortedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            sortedNumbers[i] = numbers[i];
        }
        
        // Sort the array using bubble sort
        bubbleSort(sortedNumbers);
        
        System.out.println("\nSorted numbers (ascending):");
        displayArray(sortedNumbers);
        
        // Find second highest and second lowest
        int secondLowest = findSecondLowest(sortedNumbers);
        int secondHighest = findSecondHighest(sortedNumbers);
        
        System.out.println("\n=== Results ===");
        System.out.println("Second Lowest: " + secondLowest);
        System.out.println("Second Highest: " + secondHighest);
    }
    
    /**
     * Bubble sort implementation
     * @param arr Array to be sorted
     */
    private void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    /**
     * Find second lowest number without using built-in functions
     * @param sortedArr Sorted array in ascending order
     * @return Second lowest number
     */
    private int findSecondLowest(int[] sortedArr) {
        // In a sorted array, second element is second lowest
        // But we need to handle duplicates
        for (int i = 1; i < sortedArr.length; i++) {
            if (sortedArr[i] != sortedArr[0]) {
                return sortedArr[i];
            }
        }
        // If all elements are same, return the same value
        return sortedArr[0];
    }
    
    /**
     * Find second highest number without using built-in functions
     * @param sortedArr Sorted array in ascending order
     * @return Second highest number
     */
    private int findSecondHighest(int[] sortedArr) {
        // In a sorted array, second last element is second highest
        // But we need to handle duplicates
        for (int i = sortedArr.length - 2; i >= 0; i--) {
            if (sortedArr[i] != sortedArr[sortedArr.length - 1]) {
                return sortedArr[i];
            }
        }
        // If all elements are same, return the same value
        return sortedArr[sortedArr.length - 1];
    }
    
    /**
     * Display the original array
     */
    private void displayArray() {
        displayArray(numbers);
    }
    
    /**
     * Display any array
     * @param arr Array to display
     */
    private void displayArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}