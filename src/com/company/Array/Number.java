package com.company.Array;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
//        int num = 239;
//        int fi=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();

        int lastDigit = number%10;

        int firstDigit = number;
        while (firstDigit>=10){
            firstDigit=firstDigit/10;
        }
        System.out.println("First Digit :"+firstDigit);
        System.out.println("Last Digit :"+lastDigit);
        System.out.println("Sum :"+(firstDigit+lastDigit));







        //        while (num!=0) {
//            int s = num % 10;
//             fi=s;
//            num = num / 10;
//        }
//        System.out.println(fi);


    }
}
