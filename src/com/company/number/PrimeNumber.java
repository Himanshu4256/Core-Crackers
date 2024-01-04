package com.company.number;

import java.util.Scanner;
// Prime number jo 1 and kudh se divide hote ho but one 1 loop ni chalaenge bcoz 1 se sare number divide hote hai.

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = sc.nextInt();
        int count = 0;

        for (int i = 2; i < number; i++) {
            if (number%i==0){
                count++;
            }
        }
        if (count>0){
            System.out.println(number+ " Is not prime number :");
        }else {
            System.out.println(number+ " Is prime number");
        }
    }
}
