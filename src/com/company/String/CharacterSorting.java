package com.company.String;

import java.util.Arrays;

public class CharacterSorting {
    public static void main(String[] args) {
        String s = "sdgfluav";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
//        String ss = new String(ch);
//        System.out.println(ss);

        for (Character a : ch) {
        System.out.println(a);
        }

//        for (int i = 0; i < s.length(); i++) {
//            System.out.print(ch[i]);
//        }
    }
}
