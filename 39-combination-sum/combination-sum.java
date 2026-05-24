class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(arr,0,0,target,new ArrayList<>(),ans);
        return ans;
    }
    public void helper(int[] arr,int idx,int sum,int target,
    List<Integer>diary,List<List<Integer>>ans){
        // target mil gaya
        if(sum==target){
            ans.add(new ArrayList<>(diary));
            return;
        }
    // invalid case
        if(sum>target||idx>=arr.length){
            return;
        }
        // skip current element
        helper(arr,idx+1,sum,target,diary,ans);
        // pick current element
        diary.add(arr[idx]);
        helper(arr,idx,sum+arr[idx],target,diary,ans);
        // backtracking
        diary.remove(diary.size()-1);
    }
}