package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an array of integers of 10 elements.");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter " + i + " element:");
            array[i] = scanner.nextInt();
        }
        System.out.println("You enter next array:");
        System.out.println(Arrays.toString(array));
        int sum = 0;
        int positiveElements = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] > 0) {
                positiveElements++;
            }
        }
        System.out.println();
        System.out.println("The sum of all elements is: " + sum);
        System.out.println("The number of positive elements is: " + positiveElements);
        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] > array[j]) {
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(array));
    }
}
