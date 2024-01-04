package com.company.Array;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        int ar[] = {1,5,4,2,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to get Position of Number");
        int searchElement = sc.nextInt();
        for (int i = 0; i < ar.length; i++) {
            if (searchElement==ar[i]){
                System.out.println("your Index is at :"+i+" :Position");
            }
            else {
                System.out.println("this number is not present in array");
                break;
            }
        }
        Scanner s = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("Now Enter position to get Number");
        int position = s.nextInt();
        for (int i = 0; i < ar.length; i++) {
            System.out.println("at this position the Number is :"+ar[position]);
            break;
        }
    }
}
