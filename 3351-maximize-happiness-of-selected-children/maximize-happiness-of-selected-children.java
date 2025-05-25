class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int count=0;
        Arrays.sort(happiness);
        int n=happiness.length;
        int i=n-1;
        long ans=0;
        while(count!=k){
            if(happiness[i]-count>0){
                ans+=happiness[i]-count;
            }
            count++;
            i--;
        }
        return ans;
    }
}