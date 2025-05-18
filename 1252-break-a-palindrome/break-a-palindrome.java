class Solution {
    public String breakPalindrome(String palindrome) {
        int n=palindrome.length();
        StringBuilder sb= new StringBuilder(palindrome);
        if (n == 1) {
            return "";
        }
        for (int i=0;i<n/2;i++) {
            if (sb.charAt(i)!='a') {
                sb.setCharAt(i,'a');
                return sb.toString();
            }
        }
        sb.setCharAt(n-1,'b');
        return sb.toString();
    }
}