package com.company.String;

public class StringDuplicatesRemove {
    public static void main(String[] args) {
        String str = "welcolmcew";
        String str2 = "";
        for (int i = 0; i < str.length()-1; i++) {
            char ch = str.charAt(i);
            //IndexOf = ye check krega ki kya 'ch' wala character str2 m hai agr hai to uska 'index' return krega aur ni hai to '-1'.
            if (str2.indexOf(ch)== -1){
                str2+=ch;
            }
        }
        System.out.print(str2);
    }
}
