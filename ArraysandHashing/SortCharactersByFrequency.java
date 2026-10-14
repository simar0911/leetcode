package LeetCode.ArraysandHashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for(char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(freq.entrySet());

        
        Collections.sort(list, (a, b) -> b.getValue().compareTo(a.getValue()));

        
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            char character = entry.getKey();
            int count = entry.getValue();
            
            
            for (int i = 0; i < count; i++) {
                result.append(character);
            }
        }
        return result.toString();
    }
}
    
