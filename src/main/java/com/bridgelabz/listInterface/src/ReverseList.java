package com.bridgelabz.listInterface.src;

import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>();
        List<Integer> linkedlist = new LinkedList<>();
        for(int i=0;i<10;i++){
            arraylist.add(i+1);
            linkedlist.add(i+1);
        }
        Collections.reverse(arraylist);
        Collections.reverse(linkedlist);
        System.out.println("Array List: " + arraylist);
        System.out.println("Linked List: " + linkedlist);
    }
}
