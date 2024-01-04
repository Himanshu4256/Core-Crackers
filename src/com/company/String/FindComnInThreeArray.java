package com.company.String;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindComnInThreeArray {
    public static void main(String[] args) {
        Integer arr1[] = {1,2,3,9,8,7};
        Integer arr2[] = {4,1,2,10,15};
        Integer arr3[] = {5,1,2,4,10};

      //  int total[] = new int[arr1.length + arr2.length + arr3.length];

        List<Integer> l1 = Arrays.asList(arr1);
        List<Integer> l2 = Arrays.asList(arr2);
        List<Integer> l3 = Arrays.asList(arr3);

        HashSet<Integer> h = new HashSet<>();
        h.addAll(l1);
        h.addAll(l2);
        h.addAll(l3);

        List<Integer> finalList = new ArrayList<>();
        for (Integer num:h) {
            if (l1.contains(num)  && l2.contains(num) || l2.contains(num) && l3.contains(num) || l3.contains(num) && l1.contains(num) ){
                finalList.add(num);
            }
        }
        System.out.println(finalList);











        //        for (int i = 0; i < arr1.length; i++) {
//            total[i] = arr1[i];
//        }
//
//        for (int i = 0; i < arr2.length; i++) {
//            total[total.length-1] = arr2[i];
//        }
//        for (int i = 0; i < arr3.length; i++) {
//            total[total.length-1] = arr3[i];
//        }
//
//
//        for (int i = 0; i < total.length; i++) {
//            System.out.println(total[i]);
//        }
    }
}