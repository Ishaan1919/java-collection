package com.bridgelabz.queueInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Queue<String> q = new LinkedList<String>();

        q.add("1");
        int n = 5;
        for(int i=0;i<n;i++){
            String str = q.poll();
            list.add(str);
            q.offer(str + "0");
            q.offer(str + "1");
        }
        System.out.println(list);
    }
}
