package com.company.String;

public class StringPalindrome {
       public static void main(String[] args) {
//           String s1 = "TOT";
//           String s2 = "";
//
//           for (int i = s1.length()-1; i >= 0; i--) {
//               s2 = s2+s1.charAt(i);
//           }
//           if (s1.equals(s2)){
//               System.out.println("Palindrome String");
//           }
//           else {
//               System.out.println("Not Palindrome");
//           }


        String s = "totm";
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        System.out.println("Reverse String :"+rev);
        if(s.equals(rev)){
            System.out.println("Palindrome String");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}


//