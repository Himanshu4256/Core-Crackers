package com.company.String;

public class EvenLength {
    public static void main(String[] args) {
        String st = "Hell Vicer fjjf yyt hhhh";

        String[] s = st.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (s[i].length()%2==0){
                System.out.println(s[i]);
            }
        }
    }
}