class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int n=tokens.length;
        int l=0;
        int r=n-1;
        int score=0;
        int maxScore=0;
        while(l<=r){
            if(power>=tokens[l]){
                score++;
                power-=tokens[l];
                l++;
                maxScore = Math.max(maxScore, score);
            }
            else if(score>0){
                power+=tokens[r--];
                score--;
            }
            else{
                break;
            }
        }
        return maxScore;
    }
}