class Solution {
     class Pair {
        public int plantTime;
        public int growTime;

        Pair(int plantTime, int growTime) {
            this.plantTime = plantTime;
            this.growTime = growTime;
        }
    }
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n=plantTime.length;
        Pair[] bloomTime= new Pair[n];
        for(int i=0;i<n;i++){
            bloomTime[i]=new Pair(plantTime[i],growTime[i]);
        }
        Arrays.sort(bloomTime, (a,b)-> b.growTime-a.growTime);
        int ans=0;
        int plantDays=0;
        for(Pair curr:bloomTime){
            ans=Math.max(ans,plantDays+curr.plantTime+curr.growTime);
            plantDays+=curr.plantTime;
        }
        return ans;
    }
}