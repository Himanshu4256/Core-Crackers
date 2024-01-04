package com.company.number;

import java.util.ArrayList;
import java.util.Collections;

public class zSortExample {
    public static void main(String[] args) {
        ArrayList<zEmp> emps=new ArrayList<>();
        emps.add(new zEmp("Vishal","657890",2));
        emps.add(new zEmp("Vishal","657890",1));
        emps.add(new zEmp("Harsh","657891",5));
        emps.add(new zEmp("Himanshu","657891",4));
        emps.add(new zEmp("Himanshu","657892",3));

        System.out.println("------------------------------");
        System.out.println(emps);
        //     Collections.sort(emps);
        //comparator by id
        System.out.println("Id wise sorting Using Comparator");
        Collections.sort(emps,new zIdComparator());
        System.out.println(emps);

        //comparator by name
        System.out.println("Name sortig wise Using Comparator");
        ArrayList<zEmp> emps1=new ArrayList<>(emps);
        Collections.sort(emps1,new zNameComparator());
        System.out.println(emps1);

    }

}
