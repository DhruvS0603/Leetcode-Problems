class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n= arr.length;
        int[] prefixSum= new int[n+1];
        for(int i=0;i<n;i++){
            prefixSum[i+1]=prefixSum[i]+arr[i];
        }
        int j=1;
        int ans=0;
        while(j<=n){
            for(int i=j;i<=n;i++){
                ans+=prefixSum[i]-prefixSum[i-j];
            }
            j+=2;
        }
        return ans;
    }
}