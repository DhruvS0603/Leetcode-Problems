class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq= new int[256];
        Arrays.fill(freq,-1);
        int n=s.length();
        int start=-1;
        int maxLen=0;
        for(int i=0;i<n;i++){
            if(freq[s.charAt(i)]>start){
                start=freq[s.charAt(i)];
            }
            freq[s.charAt(i)]=i;
            maxLen=Math.max(maxLen,i-start);
        }
        return maxLen;
    }
}