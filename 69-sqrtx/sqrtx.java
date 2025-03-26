class Solution {
    public int mySqrt(int x) {
        int start=1;
        int end=x;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==x){
                return mid;
            }
            if((long)mid*mid<(long)x){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return Math.round(end);  
    }
}