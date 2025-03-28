package com.bridgelabz.setInterface;

import java.util.HashSet;
import java.util.Set;

public class SubSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        System.out.println(isSubset(set1, set2)); // Output: true
    }

    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        return set2.containsAll(set1);
    }
}

