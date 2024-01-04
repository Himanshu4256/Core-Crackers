package com.company.Array;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] a = {10,11,5,4,7};

        for (int i = 0; i < a.length; i++) {
            int next = -1;
            for (int j = i+1; j < a.length; j++) {
                if (a[i]<a[j]){
                    next = a[j];
                    //break;
                }
            }
            System.out.println("next greater element of "+a[i]+" is :"+next);
        }

    }
}