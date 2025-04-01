class Solution {
    public boolean canPlaceBall(int[] position,int m,int force){
        int count=1;
        int lastPlaced=position[0];
        for(int i=1;i<position.length;i++){
            if(position[i]-lastPlaced>=force){
                count++;
                lastPlaced=position[i];
                if(count==m){
                    return true;
                }
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n= position.length;
        int left=1; 
        int right=position[n-1]-position[0];
        int maxForce=1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(canPlaceBall(position,m,mid)){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        maxForce=right;
        return maxForce;
    }
}