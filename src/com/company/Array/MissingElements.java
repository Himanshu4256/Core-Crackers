package com.company.Array;

import java.util.Arrays;

public class MissingElements {
    public static void main(String[] args) {
        int ar[] = {1,5,4,2,6};
        Arrays.sort(ar);
        int expNum = ar.length+1;  //including missing number
        int exptotal = (expNum*(expNum+1))/2; // jo exp Num hai unka sum nikala hai
        int realTotal = 0;
        for (int i = 0; i < ar.length; i++) {
                realTotal+=ar[i];
        }
        System.out.println("Missing Number is :"+(exptotal-realTotal));
    }
}
