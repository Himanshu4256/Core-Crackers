package com.company.String;

public class FIndWordLength {
    public static void main(String[] args) {
        String str = "Padho magar pyar se";
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            System.out.println("Length of "+s[i]+" is :"+s[i].length());
        }
    }
}