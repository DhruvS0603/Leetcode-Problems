class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxSum=0;
        int lsum=0;
        int rsum=0;
        int n= cardPoints.length;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        maxSum=lsum;
        for(int i=0;i<k;i++){
            lsum-=cardPoints[k-i-1];
            rsum+=cardPoints[n-i-1];
            maxSum=Math.max(maxSum,lsum+rsum);
        }
        return maxSum;
    }
}