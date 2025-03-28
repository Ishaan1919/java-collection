package com.bridgelabz.queueInterface;

import java.util.PriorityQueue;
import java.util.Queue;

class Pair implements Comparable<Pair>{
    String a;
    int b;
    Pair(String a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public int compareTo(Pair curr){
        return Integer.compare(curr.b,this.b);
    }
}

public class HospitalTriageSystem {
    public static void main(String[] args) {
        Queue<Pair> q = new PriorityQueue<>();
        q.offer(new Pair("John",3));
        q.offer(new Pair("Alice",5));
        q.offer(new Pair("Bob",2));
        while(!q.isEmpty()){
            Pair p = q.poll();
            System.out.println(p.a + " " + p.b);
        }
    }
}
