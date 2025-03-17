class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int sum=0;
        int len=0;
        int ans=Integer.MAX_VALUE;
        while(right<nums.length){
            sum+=nums[right];
            while(sum>=target){
                len=right-left+1;
                ans=Math.min(ans,len);
                sum-=nums[left++];
            }
            right++;
        }
        return (ans==Integer.MAX_VALUE) ? 0: ans;
    }
}