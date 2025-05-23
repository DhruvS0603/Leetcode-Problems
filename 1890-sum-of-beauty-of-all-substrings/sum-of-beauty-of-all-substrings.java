class Solution {
    public int beautySum(String s) {
        int ans=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int[] freq= new int[26];
            
            for(int j=i;j<n;j++){
                char c=s.charAt(j);
                freq[c-'a']++;
                int maxFreq=Integer.MIN_VALUE;
                int minFreq=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                        maxFreq=Math.max(maxFreq,freq[k]);
                        minFreq=Math.min(minFreq,freq[k]);  
                    } 
                }
                ans+=maxFreq-minFreq;
            }
        }
        return ans;
    }
}