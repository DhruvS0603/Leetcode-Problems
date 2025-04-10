class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n=nums.length;
        int m=queries.length;
        int[] sum=new int[n+1];
        int[] ans= new int[m];
        for(int i=0;i<n;i++){
            sum[i+1]=sum[i]+nums[i];
        }
         for (int i = 0; i < queries.length; i++) {
            int query = queries[i];
            int low = 0, high = n;
            while (low < high) {
                int mid = (low + high + 1) / 2;
                if (sum[mid] <= query) {
                    low = mid;
                } else {
                    high = mid - 1;
                }
            }
            ans[i] = low;
        }
        return ans;
    }
}