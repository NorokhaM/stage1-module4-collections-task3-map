package com.epam.mjc.collections.map;

import java.util.*;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer>  map=new HashMap<>();
        String s="";
        int a=0;
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            if (entry.getValue().equals(s) && entry.getKey()>a){
                continue;
            }
            map.put(entry.getValue(),entry.getKey());
            s=entry.getValue();
            a=entry.getKey();
        }
        return map;
    }
}
