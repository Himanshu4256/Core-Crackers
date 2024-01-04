package com.company.Array;

public class PairofSum {
    public static void main(String[] args) {
        int GivenSum = 50;

        int[] b = {10,20,30,40,50};
        for (int i = 0; i < b.length; i++) {
            for (int j = i+1; j < b.length; j++) {
                if (b[i]+b[j]==GivenSum){
                    System.out.println("The Pair of "+GivenSum+" = "+b[i]+"+"+b[j]);
                }
            }
        }
    }
}
