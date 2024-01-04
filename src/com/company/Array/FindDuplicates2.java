package com.company.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicates2 {
    public static void main(String[] args) {
        ArrayList arr=new ArrayList<>();
        int[] a = { 10,20,10,30,50,30,20,10 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == (a[j])) {
                    if (arr.contains(a[i])) {
                        continue;
                    }
                    else {
                        arr.add(a[i]);
                    }
                }
            }
        }
        System.out.println(arr);
    }
}