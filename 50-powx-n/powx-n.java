class Solution {
    public double findPower(double x,long n){
        if(n==0){
            return 1;
        }
        double half=findPower(x,n/2);
        double ans=half*half;
        if(n%2==1){
            return x*ans;
        }
        return ans;
    }
    public double myPow(double x, int n) {
        long N = n;
        if(N < 0){
            N = -N;
            x = 1 / x;
        }
        return findPower(x,N);
    }
}