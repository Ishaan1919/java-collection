package com.bridgelabz.setInterface;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetToSortedList {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        Set<Integer> sortedSet = new TreeSet<>(set);
        System.out.println(sortedSet);
    }
}
