class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        helper(0,0,n,new StringBuilder(),res);
        return res;
    }
    public void helper(int open,int close,int n,StringBuilder temp,List<String> res){
        if(open==n&&close==n){
            res.add(temp.toString());
            return;
        }
        if(open<n){
            temp.append('(');
            helper(open+1,close,n,temp,res);
            temp.deleteCharAt(temp.length()-1);
        }
        if(close<open){
            temp.append(')');
            helper(open,close+1,n,temp,res);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}