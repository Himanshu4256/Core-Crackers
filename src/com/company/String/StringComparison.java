package com.company.String;

public class StringComparison {

    public static void main(String[] args) {
        String str1 = "Welcome";
        String str2 = "Welcohewuu";
        boolean isCompare = false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i)!=str2.charAt(i)){
                isCompare = false;
                break;
            }
            isCompare = true;

        }
        System.out.println("String are equal :"+isCompare);
    }
}
