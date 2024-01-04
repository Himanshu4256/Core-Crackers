package com.company.String;

import java.util.*;

//Q - String k elements ko print kro Decreasing order mai values(1,2,3) k base per.
public class FrequencyInDescending {
    public static void main(String[] args) {
        String s = "banana";
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0; i<s.length();i++){
            Character ch = s.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        //entrySet() method in Java is used to create a set out of the same elements contained in the hash map. ye Map k elements ko contain krta hai
        Set<Map.Entry<Character,Integer>> set = map.entrySet(); // (Map.Entry) interface provides certain methods to access the entry in the Map.
        //Now we convert into List Bcoz "Collections.sort" List ko sort krta hai.

        List<Map.Entry<Character,Integer>> list = new ArrayList<Map.Entry<Character,Integer>>(set);

        //Comparator k base pr sort krenge.
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (Map.Entry<Character,Integer> entry : list){
            System.out.println("frequency of occurrence of "+entry.getKey()+" "+entry.getValue());
        }

    }
}
