package com.company.Array;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int arr[] = {10,20,0,0,20,40,50,0,60};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==0){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }
}
