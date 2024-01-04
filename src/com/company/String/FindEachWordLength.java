package com.company.String;

public class FindEachWordLength {
    static void countWords(String st){
        String[] array = st.split(" ");
        String words[] = {"First","Second","Third","Fourth","Fifth","Six"};
        int index = 0;
        for (String s: array) {
            System.out.println(words[index]+" word of length is :"+s.length());
            index++;
        }
    }

    public static void main(String[] args) {
        String st = "Hi Tom Welcome to my House";
        countWords(st);
    }
}