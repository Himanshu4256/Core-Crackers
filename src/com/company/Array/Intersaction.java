package com.company.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Intersaction {
    public static void main(String[] args) {
        int[] a1 = {3,5,9,11,13,12};
        int[] b1 = {4,3,6,5,8,11};
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < b1.length; j++) {
                if (a1[i]==b1[j]) {
                    System.out.println(a1[i]);
                }
            }

        }
    }
}