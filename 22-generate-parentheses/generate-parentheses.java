class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        backtrack(0,0,"",n,ans);
        return ans;
    }
    public static void backtrack(int openP,int closedP,String s,int n,List<String> ans){
        if(openP==closedP && openP+closedP==2*n){
            ans.add(s);
            return;
        }
        if(openP<n){
            backtrack(openP+1,closedP,s+"(",n,ans);
        }
        if(closedP<openP){
            backtrack(openP,closedP+1,s+")",n,ans);
        }
    }
}