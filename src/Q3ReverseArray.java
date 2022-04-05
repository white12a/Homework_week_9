import java.util.Scanner;

public class Q3ReverseArray {
    //3. Write a Java program to reverse an array of integer values.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// scanner class
        System.out.println("Enter array's 1st value: ");
        int value = input.nextInt();
        System.out.println("Enter array's 2nd value: ");
        int value1 = input.nextInt();
        System.out.println("Enter array's 3rd value: ");
        int value2 = input.nextInt();
        System.out.println("Enter array's 4th value: ");
        int value3 = input.nextInt();
        int[] a = new int[]{value, value1, value2, value3};// original array

        System.out.print("Original Array: ");// loop to iterate array elements
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Reverse Array: ");// iterate reverse array
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");

        }
    }
}

