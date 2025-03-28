package com.bridgelabz.listInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RemoveElements {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
//        3, 1, 2, 2, 3, 4
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        HashMap<Integer,Integer> map = new HashMap<>();

        for(Integer i:list){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int n = list.size();
        for(int i=n-1;i>=0;i--){
            int num = list.get(i);
            int val = map.get(num);
            if(val>1){
                map.put(num,val-1);
                list.remove(i);
            }
        }

//        List<Integer> ans = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            int num = list.get(i);
//            if(!ans.contains(num)){
//                ans.add(num);
//            }
//        }
        System.out.println(list);
    }
}
