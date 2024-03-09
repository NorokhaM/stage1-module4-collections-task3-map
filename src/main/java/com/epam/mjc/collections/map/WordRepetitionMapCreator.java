package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        if (sentence.isEmpty()) return Collections.emptyMap();
        Map<String, Integer> wordRepetitionMap = new HashMap<>();
        String[] words = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        for (String word : words) {
            wordRepetitionMap.put(word, wordRepetitionMap.getOrDefault(word, 0) + 1);
        }
        return wordRepetitionMap;
    }
}
