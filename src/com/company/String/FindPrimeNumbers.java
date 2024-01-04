package com.company.String;

public class FindPrimeNumbers {
    public static void main(String[] args) {
        int range = 101;
        for (int i = 2; i < range; i++) {
         if (range%i == 0){
             System.out.println("Number is Prime");
             break;
         }
         else {
             System.out.println("Number is Not prime");
             break;
         }
        }
    }
}
