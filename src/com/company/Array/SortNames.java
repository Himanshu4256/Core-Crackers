package com.company.Array;

import java.util.Arrays;

public class SortNames {
    public static void main(String[] args) {
        String[] names = {"Banana","Grapes","Apple"};
        Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
