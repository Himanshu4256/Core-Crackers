package com.company.number;

import java.util.HashMap;
import java.util.Map;

public class FirstDuplicateOccurence {
    public static void main(String[] args) {
        int[] b = {1,3,2,3,5,4,9,4};
        Map<Integer,Integer> m = new HashMap<>();
        for (Integer a:b) {
            if (m.containsKey(a)){
                m.put(a,m.get(a)+1);
            }
            else {
                m.put(a,1);
            }
        }
        for (Integer v: m.keySet()) {
            if (m.get(v)>1){
                System.out.println(v);
                break;
            }
        }
    }
}
