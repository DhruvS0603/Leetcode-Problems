class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int n=nums.length;
        int ans=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum==0){
                ans++;
            }
        }
        return ans;
    }
}