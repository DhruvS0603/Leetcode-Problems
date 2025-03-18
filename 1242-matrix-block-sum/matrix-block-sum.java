class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] prefixSum=new int[m+1][n+1];
        int[][] ans=new int[m][n];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                prefixSum[i][j]=mat[i-1][j-1]+prefixSum[i-1][j]+prefixSum[i][j-1]-prefixSum[i-1][j-1];
            }
        }
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                int x1=Math.max(0,i-k);
                int y1 = Math.max(0, j-k);
                int x2 = Math.min(mat.length-1, i+k);
                int y2 = Math.min(mat[0].length-1, j+k);
                ans[i][j]=prefixSum[x2+1][y2+1]-prefixSum[x1][y2+1]-prefixSum[x2+1][y1]+prefixSum[x1][y1];
            }
        }
        return ans;
    }
}