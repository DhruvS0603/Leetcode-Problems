class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int i=0;
        int j=0;
        List<Integer> list= new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<l1 && j<l2){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if( nums1[i]>nums2[j]){
                j++;
            }
            else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] ans= new int[list.size()];
        for(int k=0;k<ans.length;k++){
            ans[k]=list.get(k);
        }
        return ans;
    }
}