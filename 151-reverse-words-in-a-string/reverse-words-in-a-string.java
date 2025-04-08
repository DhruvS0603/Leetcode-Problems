class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String reversedString = sb.toString();
        StringBuilder ans= new StringBuilder();
        int n = reversedString.length();
        int i = 0;
        while (i < n) {
            StringBuilder word = new StringBuilder();
            while (i < n && reversedString.charAt(i) != ' ') {
                word.append(reversedString.charAt(i));
                i++;
            }
            word.reverse();
            if (word.length() > 0) {
                ans.append(word).append(" ");
            }
            while (i < n && reversedString.charAt(i) == ' ') {
                i++;
            }
        }
        if (ans.length() > 0) {
            ans.deleteCharAt(ans.length() - 1); // Remove the trailing space
        }
        return ans.toString();
    }
}