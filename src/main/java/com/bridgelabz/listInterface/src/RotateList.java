package com.bridgelabz.listInterface.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int rotate = 4;
        for(int i=0;i<10;i++){
            list.add(i+1);
        }
        Collections.rotate(list,rotate);
        System.out.println(list);
    }
}
