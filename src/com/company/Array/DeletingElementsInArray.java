package com.company.Array;

public class DeletingElementsInArray {

    public static void main(String[] args) {
    int a[] = {3,7,4,2,8,3,8};
        for (int i = 0; i < a.length; i++) {
            if (i==5){
                continue;
            }
            System.out.print(" "+a[i]);
        }
    }
}
