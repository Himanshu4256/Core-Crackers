package com.company.Array;

import java.util.Scanner;

public class SortNames_ {
    public static void main(String[] args) {
        int n = 0;
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of names :");
        n = sc.nextInt();
        String names[] = new String[n];
        System.out.println("Enter all names");

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (names[i].compareTo(names[j])>0)  // ye agr 1st 2nd se  greater hai to 1 return krta hai. if less hi to -1. if equal hai to 0. ange ye
                                                     // and ye word k 1-1 char ko compare krta hai jha diff hua wahi se compare krega.
                {
                   temp = names[i];
                   names[i] = names[j];
                   names[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array :");
        for (String name:names) {
            System.out.println(name);
        }
    }
}
