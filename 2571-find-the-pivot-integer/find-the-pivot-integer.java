class Solution {
    public int pivotInteger(int n) {
        int leftSum = n * (n + 1) / 2;
        int rightSum = 0;

        while(n >= 0) {
            leftSum -= n;
            rightSum += n;
            if (leftSum + n == rightSum) {
                return n;
            }
            if (leftSum < rightSum) {
                return -1;
            }
            n--;
        }
        return -1;   
    }
}