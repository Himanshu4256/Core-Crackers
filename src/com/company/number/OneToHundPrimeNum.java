package com.company.number;

public class OneToHundPrimeNum {
    public static void main(String[] args) {
        int count = 0;
        for (int num= 1; num <= 100; num++) {
            for (int j = 2; j < num-1; j++) {
                if (num%j==0){
                    count++;
                }
            }
            if (count==0) {
                System.out.println(num);
            }
            else {
                count=0;  //yha count es liye 0 kiya hai bcoz agr nahi kre to hmaesa else cond m hi aage & ye 'if (count==0)' kabhi true nhi hogi. kyoki 1st baar m hi temp 1 ho jaega
            }
        }
    }
}
