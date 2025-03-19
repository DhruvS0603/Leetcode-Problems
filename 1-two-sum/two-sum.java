class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans= new int[2];
        int n=nums.length;
        HashMap<Integer,Integer> m= new HashMap<>();
        for(int i=0;i<n;i++){
            int complement=target-nums[i];
            if(m.containsKey(complement)){
                ans[0]=m.get(complement);
                ans[1]=i;
                return ans;
            }
            m.put(nums[i],i);
        }
        return ans;
    }
}