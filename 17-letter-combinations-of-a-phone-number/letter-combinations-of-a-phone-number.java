class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits.length()==0){
            return res;
        }
         String[] map = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };
        helper(digits,0,map,new StringBuilder(),res);
        return res;
    }
    public void helper(String digits,int idx,
    String[] map,StringBuilder dairy,List<String> res){
        if(idx==digits.length()){
            res.add(dairy.toString());
            return;
        }
        String letters=map[digits.charAt(idx)-'0'];
        for(int j=0;j<letters.length();j++){
            dairy.append(letters.charAt(j));
            helper(digits,idx+1,map,dairy,res);
            dairy.deleteCharAt(dairy.length()-1);
        }
    }
}