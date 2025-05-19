class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<tops.length;i++){
            map.put(tops[i],map.getOrDefault(tops[i],0)+1);
            map.put(bottoms[i],map.getOrDefault(bottoms[i],0)+1);
        }
        int maxi=0;
        int ele=0;
        for(int m:map.keySet()){
            if(map.get(m)>maxi){
                maxi=map.get(m);
                ele=m;
            }
        }
        if(maxi<tops.length){
            return -1;
        }
        int topRotate=0;
        int bottomRotate=0;
        for(int i=0;i<tops.length;i++){
            if(tops[i]!=ele && bottoms[i]!=ele){
                return -1;
            }
            if(tops[i]!=ele){
                topRotate++;
            }
            if(bottoms[i]!=ele){
                bottomRotate++;
            }
        }
        return Math.min(topRotate,bottomRotate);
    }
}