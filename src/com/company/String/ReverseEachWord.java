package com.company.String;

public class ReverseEachWord {
    public static void main(String[] args) {
        String string = "Explain your self";
        String[] str = string.split(" ");
        for (int i = 0; i < str.length; i++) {
            String reverseString = " "+str[i];
            for (int j = reverseString.length()-1; j >=0; j--) {
                System.out.print(reverseString.charAt(j));
            }
        }

        // 2nd
//        String str = "Explain your self";
//        String[] word = str.split("\\s");   \\s == spaces
//
//        String reverseWord = "";
//        for (String w:word){
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder.reverse();
//
//            reverseWord = reverseWord+stringBuilder.toString()+" "; // change,convert toString
//        }
//        System.out.println(reverseWord);

    }
}
