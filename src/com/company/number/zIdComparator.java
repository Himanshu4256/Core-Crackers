package com.company.number;

import java.util.Comparator;

public class zIdComparator implements Comparator<zEmp>{

    @Override
    public int compare(zEmp o1, zEmp o2) {
        return o1.getId() - o2.getId();
    }


}

