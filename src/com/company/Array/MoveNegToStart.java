package com.company.Array;

public class MoveNegToStart {
    public static void main(String[] args) {
        int[] arr= {-1,-20,30,40,50,-8};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]<0){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.print(" "+arr[i]);
        }
    }
}
