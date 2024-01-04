package com.company.String;

public class FirstChar {
    public static void main(String[] args) {
        String s = "Welcome to Gurugram";
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            String s1 = str[i];
            System.out.println(s1.charAt(0));
        }
    }
}