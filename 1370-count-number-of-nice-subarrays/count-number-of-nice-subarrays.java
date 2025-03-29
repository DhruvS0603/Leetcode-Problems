class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int oddCount=0;
        int count=0;
        int n=nums.length;
        Map<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                oddCount++;
            }
            if(map.containsKey(oddCount-k)){
                count+=map.get(oddCount-k);
            }
            map.put(oddCount,map.getOrDefault(oddCount,0)+1);
        }
        return count;
    }
}