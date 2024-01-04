package com.company.String;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "Welcome to Ghaziabad";
        String[] s =  str.split(" ");
        for (int i = s.length-1; i >= 0; i--) {
            System.out.print(" "+s[i]);
        }
    }
}