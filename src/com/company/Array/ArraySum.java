package com.company.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int a[] = {6,4,3,7,2,1,7};
        int sum = Arrays.stream(a).sum();
        System.out.println(sum);
    }
}
