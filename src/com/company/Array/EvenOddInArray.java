package com.company.Array;

public class EvenOddInArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Even Numbers:");
        for (int num : numbers) {
            if ((num & 1) == 0) { // Using bitwise AND with 1 to check for evenness
                System.out.print(num + " ");
            }
        }

        System.out.println("\nOdd Numbers:");
        for (int num : numbers) {
            if ((num & 1) != 0) { // Using bitwise AND with 1 to check for oddness
                System.out.print(num + " ");
            }
        }
    }
}

