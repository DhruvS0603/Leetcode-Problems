class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m= mat.length;
        int n=mat[0].length;
        int ind=0;
        int[][] ans= new int[r][c];
        if (m * n != r * c) {
            return mat;  
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[ind/c][ind%c]=mat[i][j];
                ind++;
            }
        }
        return ans;
    }
}