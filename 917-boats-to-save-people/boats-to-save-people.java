class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats=0;
        int i=0;
        int n=people.length-1;
        while(i<=n){
            if(people[n]+people[i]<=limit){
                i++;
            }
            n--;
            boats++;
        }
        return boats;
    }
}