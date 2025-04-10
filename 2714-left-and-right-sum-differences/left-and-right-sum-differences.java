class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] leftSum= new int[n];
        int[] rightSum= new int[n];
        for(int i=0;i<n-1;i++){
            leftSum[i+1]=leftSum[i]+nums[i];
            rightSum[n-i-2]=rightSum[n-i-1]+nums[n-i-1];
        }
        for(int i=0;i<n;i++){
            nums[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return nums;
    }
}