package com.company.String;

//print even words
public class EvenWords {
    public static void main(String[] args) {
        String s = "Hello word fm technical team";

        String []str = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].length()%2==0)
                System.out.print(" "+str[i]);
        }
    }
}
