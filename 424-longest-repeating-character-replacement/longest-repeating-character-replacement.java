class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int maxLen=0;
        int maxFreq=0;
        int n=s.length();
        int[] freq=new int[26];
        while(r<n){
            freq[s.charAt(r)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(r)-'A']);
            if((r-l+1)-maxFreq>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}