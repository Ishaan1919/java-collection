package com.bridgelabz.queueInterface;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Queue;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        List<Integer> list = new ArrayList<>();
        list.addAll(q);
        Collections.reverse(list);
        System.out.println(list);
    }
}
