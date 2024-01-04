package com.company.Array;

public class ZeroAndNonZeroSaperations {
    public static void sepration(int[] a){
        int temp = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]==0){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(" "+a[i]);
        }
    }
    public static void main(String[] args) {
        int[] a = {1, -5, 0, 0, 8, 0, 1};
        sepration(a);

    }
}
