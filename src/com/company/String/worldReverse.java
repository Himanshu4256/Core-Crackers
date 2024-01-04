package com.company.String;

public class worldReverse {
    public static void main(String[] args) {
        String str = "Hello Guys Welcome to Singapore";
        String[] s = str.split(" ");
        for (int i = s.length-1; i >= 0; i--) {
            System.out.print(" "+s[i]);
        }

    }
}
