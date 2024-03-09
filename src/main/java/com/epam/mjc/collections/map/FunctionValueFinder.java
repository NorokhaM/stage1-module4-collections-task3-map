package com.epam.mjc.collections.map;

import java.util.*;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        return functionMap.containsValue(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sourceList.size(); i++) {
            map.put(i, 5*sourceList.get(i) +2);
        }
        return map;
    }
}
