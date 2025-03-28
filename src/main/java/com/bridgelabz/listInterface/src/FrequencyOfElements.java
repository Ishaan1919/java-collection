//Find Frequency of Elements
//Given a list of strings, count the frequency of each element and return the results in a Map<String, Integer>.
//        Example:
//Input: ["apple", "banana", "apple", "orange"] → Output: {apple=2, banana=1, orange=1}.


package com.bridgelabz.listInterface.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfElements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");

        Map<String,Integer> map = new HashMap<>();

        for(String i:list){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
    }
}
