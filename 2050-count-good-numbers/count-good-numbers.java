class Solution {
    long mod= 1000000007;
    public int countGoodNumbers(long n) {
        long odd=n/2;
        long even=(n+1)/2;
        long ans= pow(5,even)*pow(4,odd)%mod;
        return (int) ans;
    }
    public long pow(long x, long y){
        if(y==0){
            return 1;
        }
        long temp= pow(x,y/2);
        if(y%2==0){
            return (temp*temp)% mod;
        }
        else{
            return (x*temp*temp)% mod;
        }
    }
}