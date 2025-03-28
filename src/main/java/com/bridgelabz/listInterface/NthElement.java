package com.bridgelabz.listInterface;

import java.util.LinkedList;
import java.util.List;

public class NthElement {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        int nthIndex = 2;
//    [A, B, C, D, E]
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        int ptr = 0;
        int ans = 0;
        int size = list.size();
        for(int i=0;i<nthIndex;i++){
            ptr++;
        }
        while(ptr<size){
            ptr++;
            ans++;
        }
        System.out.println(list.get(ans));
    }
}
