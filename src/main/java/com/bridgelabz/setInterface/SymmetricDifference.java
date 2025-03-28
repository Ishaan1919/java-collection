package com.bridgelabz.setInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();


        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        List<Integer> list = new ArrayList<>();
        for(Integer i:set1){
            if(!set2.contains(i)){
                list.add(i);
            }
        }

        for(Integer i:set2){
            if(!set1.contains(i)){
                list.add(i);
            }
        }
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Symmetric Difference" + list);
    }
}
