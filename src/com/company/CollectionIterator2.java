package com.company;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionIterator2 {
    public static void main(String[] args) {
        List l = Arrays.asList(4,3,4,5,6,7,8,9);

        Iterator itr = l.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
