package com.company.Array;

public class RotateArrayByOnePos {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        // store first element in temp
        int temp = arr[0];

        //Shift one element to left
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }

        //Store temp value in last position
        arr[arr.length-1]=temp;

        for (int i:arr) {
            System.out.println(i);
        }

    }
}
