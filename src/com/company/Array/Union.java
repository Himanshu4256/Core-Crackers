package com.company.Array;

public class Union {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int[] b1 = {5,6,7,8,9};
        int[] c = new int[a1.length+b1.length];

        System.arraycopy(a1, 0, c, 0, c.length);


        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < b1.length; j++) {
                if (a1[i]==b1[j]){
                    c[i + a1.length] = b1[i];
                }
            }
            System.out.print(" "+c[i]);
        }

    }
}
