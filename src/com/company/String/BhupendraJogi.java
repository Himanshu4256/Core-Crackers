package com.company.String;

public class BhupendraJogi {

    void bhupendra(){
        System.out.println("Name Btaeye");
        System.out.println("Bhupendra Jogi");
        System.out.println("US m kha kha gye hai aap ?");
        System.out.println("US m bahut jagh gya hu mai");
        bhupendra();
    }

    public static void main(String[] args) {
        BhupendraJogi b = new BhupendraJogi();
        b.bhupendra();
    }
}
