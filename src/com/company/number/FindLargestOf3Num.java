package com.company.number;

import java.util.Scanner;

public class FindLargestOf3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int one = sc.nextInt();
        System.out.println("Enter Second Number");
        int two = sc.nextInt();
        System.out.println("Enter Third Number");
        int three = sc.nextInt();

        if (one>two && one>three){
            System.out.println("Large Number is :"+one);
        }
        else if (two>one && two>three){
            System.out.println("Large Number is :"+two);
        }
        else {
            System.out.println("Large Number is :"+three);
        }









    }
}