package LeetCode.ArraysandHashing;
import java.util.*;
public class TopKFrequentWords {
   
    public List<String> topKFrequent(String[] words, int k) {
        
        Map<String, Integer> counts = new HashMap<>();
        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }

        
        PriorityQueue<String> minHeap = new PriorityQueue<>(
            (w1, w2) -> counts.get(w1).equals(counts.get(w2)) ? 
                        w2.compareTo(w1) : counts.get(w1) - counts.get(w2)
        );

        
        for (String word : counts.keySet()) {
            minHeap.offer(word);
            if (minHeap.size() > k) {
                minHeap.poll(); 
            }
        }

        
        List<String> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll());
        }
        Collections.reverse(result); 
        
        return result;
    }
}
    
