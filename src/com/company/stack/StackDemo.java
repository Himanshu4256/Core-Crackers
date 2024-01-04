package com.company.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();

        //STACK MAI HAM KISI BHI TYPE KA DATA STORE KRWA SKTE HAI.
        s.push("verma");
        s.push("kumar");
        s.push(200);
        s.push(200.6);
        s.push('c');
        s.push(432);

        System.out.println(s);
        System.out.println(s.pop());  // ye last wale element ko remove krega BUT USE REMOVE BHI KR DEGA.
        System.out.println(s);
        System.out.println(s.peek()); //ye last wale ement to return kr dega But REMOVE nhi krega.
        System.out.println(s.search("kumar")); //Returns krega NICHE se acc to this 432 is 0 index
        System.out.println(s.isEmpty());
    }
}
