package com.company.String;

public class FirstRepeatingCharacters {
    public static void main(String[] args) {
        String str = "aclprqwezswbo";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    System.out.println("first duplicate element is :"+str.charAt(j));
                    break;
                }
            }
        }
    }
}