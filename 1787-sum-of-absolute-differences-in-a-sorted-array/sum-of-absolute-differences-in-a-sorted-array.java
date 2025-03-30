class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n= nums.length;
        int[] ans= new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            ans[i] = (i * nums[i] - leftSum) + (sum - leftSum - nums[i]) - (n - 1 - i) * nums[i];
            leftSum += nums[i];
        }
        return ans;
    }
}