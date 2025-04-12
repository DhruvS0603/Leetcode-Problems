class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n= nums.size();
        int ans=Integer.MAX_VALUE;
        for(int i=l;i<=r;i++){
            if (i > n) break;
            int sum=0;
            for(int j=0;j<i;j++){
                sum+=nums.get(j);
            }
            ans=(sum>0)? Math.min(sum,ans): ans;
            int temp=sum;
            for(int j=i;j<n;j++){
                temp+=nums.get(j)-nums.get(j-i);
                if (temp > 0) {
                    ans = Math.min(ans, temp);
                }
            }
        }
        return (ans !=Integer.MAX_VALUE) ? ans:-1;
    }
}