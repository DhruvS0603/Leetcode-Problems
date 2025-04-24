class Solution {
    public int reverse(int x) {
      long reversed=0;  
      while (x!=0){
        int remainder=x%10;
        reversed=(reversed*10)+remainder;
        x=x/10;
      }
      if(reversed>Integer.MAX_VALUE || reversed<Integer.MIN_VALUE){
        return 0;
      }
      return (int)reversed; 
    }
}