class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int[] prefixSum= new int[n+1];
        for(int i=0;i<n;i++){
            prefixSum[i+1]=prefixSum[i]+nums[i];
        }
        for(int i=0;i<n;i++){
            if(prefixSum[i]==prefixSum[n]-prefixSum[i+1]){
                return i;
            }
        }
        return -1;
    }
}