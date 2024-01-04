package com.company.Array;

public class ElementsSum {
    public static void main(String[] args) {
        int a[] = {3,8,5,7,2,1};
        int sum =0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
