package com.company.String;

public class ReverseByLogic {
    public static void main(String[] args) {
        String st = "Hello World";
        String str[] = st.split(" ");
        for (int i = 0; i < str.length; i++) {
                String s1 = " "+str[i];
            for (int j = s1.length()-1; j >= 0; j--) {
                System.out.print(s1.charAt(j));
            }
        }
    }
}
