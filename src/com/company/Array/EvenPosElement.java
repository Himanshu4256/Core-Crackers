package com.company.Array;

public class EvenPosElement {
    public static void main(String[] args) {
        int a[] = {7,2,3,4,9,1};
//        for (int i = 0; i < a.length; i++) {
//            if (i%2==0){
//                System.out.println(a[i]);
//            }
//        }

        for (int i = 2; i < a.length; i=i+2) {
                System.out.println(a[i]);
        }
    }
}
