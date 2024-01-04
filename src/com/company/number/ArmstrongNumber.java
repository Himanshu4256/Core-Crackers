package com.company.number;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int copy = number;
        int rem;
        int arm=0;
        while (number>0){
            rem = number%10;
            arm = arm+(rem*rem*rem);
            number = number/10;
        }
        if (copy==arm){
            System.out.println("Number is Armstrong");
        }
        else {
            System.out.println("Not armstrong");
        }
    }
}
