package com.company.Array;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<Integer>();
        int[] a = {10,20,10,30,50,30,20,10};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == (a[j])) {
                    set.add(a[j]);
                }
            } 
        }
        System.out.println(set);
    }
}
