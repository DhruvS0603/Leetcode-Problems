class Solution {
    public int pivotInteger(int n) {
        int[] sum=new int[n+1];
        for(int i=1;i<=n;i++){
            sum[i]=sum[i-1]+i;
        }
        for(int i=1;i<=n;i++){
            if(sum[i-1]==sum[n]-sum[i]){
                return i;
            }
        }
        return -1;    
    }
}