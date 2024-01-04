package com.company.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CalculateFrequencies {
    public static void main(String[] args) {
        int vowels = 0;
        int upperCase = 0;
        String str = "Do More Crackers With Himanshu";
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        for (Character chr : map.keySet()){
            if (chr=='a' || chr=='e' || chr=='i' || chr=='o' || chr=='u' || chr=='A' || chr=='E' || chr=='I' || chr=='O' || chr=='U'){
                vowels++;
            }
//            if (Character.isUpperCase(chr)){
//                upperCase++;
//            }
            if (chr>=65 && chr<=90){
                upperCase++;
            }

            System.out.println(chr+" = "+map.get(chr));
        }
        System.out.println("Vowels are :"+vowels);
        String[] c = str.split(" ");
        System.out.println("Words are :"+c.length);
        System.out.println("upperCase :"+upperCase);
    }
}


