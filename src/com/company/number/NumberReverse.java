package com.company.number;

public class NumberReverse {
    public static void main(String[] args) {
        int num = 3247654;
        int reverse = 0;
//        while (num>0){
//            int n = num%10;
//            reverse = n;
//            num = num/10;
//            System.out.print(reverse);
//        }

        while (num!=0){
            int n = num%10;
            reverse = reverse*10+n;
            num = num/10;
        }
        System.out.println("After Reverse :"+reverse);

    }
}
