package com.company.Array;

public class AddElementInarray {
    public static void main(String[] args) {
        int ar[] = {4,5,9,8,3};
        int pos = 3;
        int num = 10;
        for (int i = 0; i < pos; i++) {
            ar[pos] = num;
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(" "+ar[i]);
        }
    }
}
