package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionIterator {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(12);
        numbers.add(8);
        numbers.add(14);
        numbers.add(34);
        numbers.add(6);

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            Integer i = it.next();
            if (i<10){
                it.remove();
            }
        }
            System.out.println(numbers);
    }
}
