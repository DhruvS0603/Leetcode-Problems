class Solution {
    public boolean isPalindrome(int x) {
        boolean flag=false;
        int reversed=0;
        int n=x;
        while(n>0){
            int y=n%10;
            n=n/10;
            reversed=(reversed*10)+y;
        }
        if(x==reversed){
            flag=true;
        }
        return flag;
    }
}