class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(0,0);
        m.put(1,0);
        m.put(2,0);
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.get(nums[i])+1);
        }
        int index=0;
        for(int j=0;j<3;j++){
            int freq=m.get(j);
            for(int i=0;i<freq;i++){
                nums[index]=j;
                index++;
            }
        }
    }
}