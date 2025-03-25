class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n= nums.length;
        List<Integer> ans= new ArrayList<>();
        int bCount=0;
        int tCount=0;
        for(int i=0;i<n;i++){
            if(nums[i]<target){
                bCount++;
            }
            if(nums[i]==target){
                tCount++;
            }
        }
        for(int i=0;i<tCount;i++){
            ans.add(bCount++);
        }
        return ans;
    }
}