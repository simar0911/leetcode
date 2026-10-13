package LeetCode.ArraysandHashing;

public class RangeSumQuery_Immutable {class NumArray {
    private int[] prefixSums;

    public NumArray(int[] nums) {
        // Handle empty array edge case safely
        if (nums == null || nums.length == 0) {
            prefixSums = new int[1]; // [0]
            return;
        }
        
        prefixSums = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSums[i + 1] = prefixSums[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        // Prevent out of bounds if array was initialized empty
        if (prefixSums.length <= 1) {
            return 0;
        }
        return prefixSums[right + 1] - prefixSums[left];
    }
}



    
}
