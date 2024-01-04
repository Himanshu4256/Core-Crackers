package com.company.Array;

import java.util.Arrays;

public class ArraySquare {
    public static void main(String[] args) {
        int[] a = {2,3,9,5,-6,-3};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i]*a[i];
        }
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+b[i]);
        }
    }
}
