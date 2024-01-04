package com.company.Array;

public class AddElements {
    public static void main(String[] args) {
        int[] a = new int[5];
        int number = 1;
        int pos = 3;
        for (int i = 0; i < a.length; i++) {
            a[i] = number;
           // System.out.println(a[i]);
            number++;
        }
        for (int i = 0; i <a.length ; i++) {
            a[pos] = 10;
            System.out.print(" "+a[i]);
        }
    }
}
