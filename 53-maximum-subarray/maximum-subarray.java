class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;
            
            // 1. Update the maximum sum found so far
            maxSum = Math.max(maxSum, currentSum);
            
            // 2. If the running sum becomes negative, drop it and reset
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}