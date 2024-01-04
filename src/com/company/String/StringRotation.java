package com.company.String;

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "avajava";
        String s2 = "javaava";
        System.out.println(check(s1,s2));
    }

    public static boolean check(String str1, String str2){


        if(str1 == null || str2==null){
            return false;
        }

        else if (str1.length()!=str2.length()){
            return false;
        }

        else {
            String s3 = str1+str1;
            return s3.contains(str2);
        }

    }
}
