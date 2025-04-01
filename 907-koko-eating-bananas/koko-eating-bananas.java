class Solution {       
    public int totalHours(int[] piles,int hourly){
        int total=0;
        int n=piles.length;
        for(int i=0; i<n;i++){
            total +=Math.ceil((double)piles[i]/(double)(hourly));
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        int n=piles.length;
        for(int i=0; i<n;i++){
            high=Math.max(high,piles[i]);
        }
        while(low<=high){
        int mid=(low+high)/2;
        int total=totalHours(piles,mid);
        if(total<=h){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    return low;
    }
}