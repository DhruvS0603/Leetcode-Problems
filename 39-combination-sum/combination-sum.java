class Solution {
    public void findCombinations(int[] candidates,int target,int ind,List<List<Integer>> ans,List<Integer> current){
        if(ind==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(current));
            }
            return;
        }
        if(candidates[ind]<=target){
            current.add(candidates[ind]);
            findCombinations(candidates,target-candidates[ind],ind,ans,current);
            current.remove(current.size()-1);
        }
        findCombinations(candidates,target,ind+1,ans,current);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        findCombinations(candidates,target,0,ans,new ArrayList<>());
        return ans;

    }
}