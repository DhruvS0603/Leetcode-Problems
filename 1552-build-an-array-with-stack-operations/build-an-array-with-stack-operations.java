class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans= new ArrayList<>();
        int num=1;
        int index=0;
        while(num<=n && index<target.length){
            if(num==target[index]){
                ans.add("Push");
                index++;
            }
            else{
                ans.add("Push");
                ans.add("Pop");
            }
            num++;
        }
        return ans;
    }
}