package com.company.String;

public class FindSpeacialChars {
    public static void main(String[] args) {
        String s = "ahfs@#d$";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch) || Character.isAlphabetic(ch)){
                continue;
            }
            else {
                System.out.print(ch);
            }
        }
    }
}
