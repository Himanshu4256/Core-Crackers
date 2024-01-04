package com.company.number;

import java.util.Scanner;

public class CountOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   //output should be length = 3
        System.out.println("Enter Any Number");
        int num = sc.nextInt();
        int even = 0;
        int odd = 0;
        while (num>0){
            int p = num%10;
            if (p%2==0){
                even++;
            }
            else {
                odd++;
            }
            num = num/10;
        }
        System.out.println("Even Num :"+even);
        System.out.println("Odd Num :"+odd);
    }
}
