class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        int z1=0;
        int z2=0;
        long s1=0;
        long s2=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==0){
                z1++;
                s1+=1;
            }
            s1+=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]==0){
                z2++;
                s2+=1;
            }
            s2+=nums2[i];
        }
        if((s1<s2 && z1==0) ||(s2<s1 && z2==0)){
            return -1;
        }
        return Math.max(s1,s2);
    }
}