class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int count=0;
        Arrays.sort(happiness);
        int n=happiness.length;
        long ans=0;
        for(int i=n-1;i>=n-k;i--){
            ans+=Math.max(0, happiness[i]-count);
            count++;
        }
        return ans;
    }
}