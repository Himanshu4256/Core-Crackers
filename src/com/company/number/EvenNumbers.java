package com.company.number;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your");
        int num = sc.nextInt();

        if (num%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }


    }
}
