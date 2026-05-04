class Solution {
    public boolean backspaceCompare(String s, String t) {
        return getactual(s).equals(getactual(t));
    }
    public String getactual(String input){
        StringBuilder actualstring=new StringBuilder();
        int hashcount=0;
        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i)=='#'){
                hashcount++;
                continue;
            }
            // agar hash nhi hai to check kro and skip kro wo element
            if(hashcount>0){
                hashcount--;
            }else{
                actualstring.insert(0,input.charAt(i));
            }
        }
        return actualstring.toString();
    }
}