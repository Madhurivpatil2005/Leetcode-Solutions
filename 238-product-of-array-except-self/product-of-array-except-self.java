class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        // Pass 1: Build Left Products
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        
        // Pass 2: Multiply Right Products backward
        int rightTotal = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * rightTotal;
            rightTotal = rightTotal * nums[i];
        }
        
        return answer;
    }
}