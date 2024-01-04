package com.company.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacters {
    public static void main(String[] args) {
        String s = "aclporqwezswbo";

        Map<Character,Integer> m = new LinkedHashMap<>(); // LinkedHashMap insertion order follow krta hai to ese liya. HashMap insertion order follow ni krta wo kuch bhi print kr dega.
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (m.containsKey(ch)){
                m.put(ch,m.get(ch)+1);
            }
            else {
                m.put(ch,1);
            }
        }

        for (Character s1:m.keySet()) {
            if (m.get(s1) == 1){
                System.out.println("key is="+s1+" value is="+m.get(s1));
                break;
            }
        }
    }
}
