package LeetCode.ArraysandHashing;
import java.util.HashMap;
public class ContinousSubArraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
       
        HashMap<Integer, Integer> remainderMap = new HashMap<>();
        
       
        remainderMap.put(0, -1);
        
        int currentSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            
           
            int remainder = currentSum % k;
            
            
            if (remainder < 0) {
                remainder += Math.abs(k);
            }
            
            
            if (remainderMap.containsKey(remainder)) {
                
                if (i - remainderMap.get(remainder) >= 2) {
                    return true;
                }
            } else {
                
                remainderMap.put(remainder, i);
            }
        }
        
        return false;
    }
}
    
