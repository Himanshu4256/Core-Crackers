package com.company.number;

import java.util.Comparator;

public class zNameComparator implements Comparator<zEmp>{

    public int compare(zEmp o1, zEmp o2) {
        return o1.getName().compareTo(o2.getName());
    }

}