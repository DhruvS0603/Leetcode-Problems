class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum=nums[0];
        int currMax=nums[0];
        int n= nums.length;
        int minSum=nums[0];
        int currMin=nums[0];
        int currSum=0;
        int tSum=0;
        for(int i=0;i<n;i++){
            tSum+=nums[i];
        }
        for(int i=1; i<n;i++){
            currMax = Math.max(currMax + nums[i], nums[i]);
            maxSum = Math.max(maxSum, currMax);
            currMin = Math.min(currMin + nums[i], nums[i]);
            minSum = Math.min(minSum, currMin);
        }
        if (tSum == minSum) {
            return maxSum;
        }
        maxSum=Math.max(maxSum,tSum-minSum);
        return maxSum;
    }
}