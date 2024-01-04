package com.company.number;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   //output should be length = 3
        System.out.println("Enter Any Number");
        Long n = sc.nextLong();
        Long sum = 0L;

        while (n>0){
            n = n/10;
            sum++;
        }
        System.out.println("Number Length is :"+sum);

    }
}
