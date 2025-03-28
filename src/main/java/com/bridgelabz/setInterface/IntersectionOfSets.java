package com.bridgelabz.setInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i=0;i<5;i++){
            set1.add(i);
            set2.add(5-i-1);
        }
        set1.add(8);
        set2.add(7);
        set2.add(9);

        List<Integer> intersection = new ArrayList<>();
        for(Integer i:set1){
            if(set2.contains(i)){
                intersection.add(i);
            }
        }
        Set<Integer> union = new HashSet<>();

        for(Integer i:set1){
            union.add(i);
        }

        for(Integer i:set2){
            union.add(i);
        }

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);

//        Set1: [0, 1, 2, 3, 4, 8]
//        Set2: [0, 1, 2, 3, 4, 7, 9]
//        Union: [0, 1, 2, 3, 4, 7, 8, 9]
//        Intersection: [0, 1, 2, 3, 4]
    }
}
