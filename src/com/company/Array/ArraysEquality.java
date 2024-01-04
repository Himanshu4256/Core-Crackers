package com.company.Array;

public class ArraysEquality {
    public static void main(String[] args) {
        int a[] = {7,4,9,1,2,6,5};
        int b[] = {7,4,9,1,2,9,5};
        boolean flag = true;

        if (a.length == b.length){
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    flag = false;
                }
            }
        }
        else{
            flag = false; // flase because here lengths are different
        }

        if (flag){
            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays are not equal");
        }
    }
}
