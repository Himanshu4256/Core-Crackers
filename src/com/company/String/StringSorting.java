package com.company.String;

public class StringSorting {
    public static void main(String[] args) {
        String s = "So8ti2g5";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            for (int j = i+1; j < s.length(); j++) {
                if (Character.isDigit(ch)){
                    if (s.charAt(i)>s.charAt(j)){

                    }
                }
            }

        }
    }
}
