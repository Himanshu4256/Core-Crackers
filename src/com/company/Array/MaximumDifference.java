package com.company.Array;

import java.util.Scanner;

public class MaximumDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter element of array");
        for (int i = 0; i <a.length ; i++) {
            a[i] = sc.nextInt();
        }


        int max = a[0];
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i]>max){
                max=a[i];
            }
            if (a[i]<min){
                min=a[i];
            }
        }

        System.out.println("max "+max);
        System.out.println("min "+min);
        System.out.println("Maximum diff is :"+(max-min));
    }
}
