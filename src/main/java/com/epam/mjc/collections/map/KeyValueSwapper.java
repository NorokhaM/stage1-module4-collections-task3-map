package com.epam.mjc.collections.map;

import java.util.*;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            map.put(entry.getValue(), entry.getKey());
        }
        return map;
    }
}
