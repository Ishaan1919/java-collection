package com.bridgelabz.setInterface;

import java.util.HashSet;
import java.util.Set;

public class CheckSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i=0;i<5;i++){
            set1.add(i);
            set2.add(5-i-1);
        }

        if(set1.equals(set2)){
            System.out.println("Both the sets are equal");
        }

        set1.add(9);
        if(!set1.equals(set2)){
            System.out.println("Both the sets are not equal");
        }
    }
}
