class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            sum=sum+mat[i][i]+mat[n-i-1][i];
        }
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }
        return sum;
    }
}