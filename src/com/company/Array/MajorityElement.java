package com.company.Array;

import java.util.HashMap;
import java.util.Map;

//Q - Majority element ko find kro jo array k half length number se jyada baar wala occurence ho.
// Ex - array size = 10, size/2 = 5, to jo element 5 ya 5 se jyda baar hai use find kro

public class MajorityElement {
    public static void main(String[] args) {
        int []a = {3,8,8,3,3,5,4,3,3,3};
        Map<Integer,Integer> map = new HashMap<>();
        for (Integer ar : a) {
            if (map.containsKey(ar)){
                map.put(ar,map.get(ar)+1);
            }
            else {
                map.put(ar,1)
;            }
        }
        int size = map.size();
        for (Integer key: map.keySet()) {
            if (map.get(key)>size/2){
                System.out.print(key+" ");
            }
        }

    }
}
