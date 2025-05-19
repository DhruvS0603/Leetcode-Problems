class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set= new HashSet<>();
        for (int num : banned) {
            set.add(num);
        }
        int count=0;
        for(int i=1;i<=n;i++){
            if(set.contains(i)){
                continue;
            }
            else if(i>maxSum){
                break;
            }
            else{
                maxSum-=i;
                count++;
            }
        }
        return count;
    }
}