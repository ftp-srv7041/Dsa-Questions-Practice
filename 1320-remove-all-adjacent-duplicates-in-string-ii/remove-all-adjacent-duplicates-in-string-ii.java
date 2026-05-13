class Solution {
    class Node{
        char ch;
        int count;
        Node(char ch,int count){
            this.ch=ch;
            this.count=count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Node>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);            
            // if stack is empty
            if(st.isEmpty()){
                st.push(new Node(c,1));
                continue;
            }
            // agar same character mile to
            if(st.peek().ch==c){
                st.peek().count++;

                // agar k equal ho gaya toh 
                if(st.peek().count==k){
                    st.pop();
                }
            }
             // agar different character mile to
                else{
                    st.push(new Node(c,1));
                }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            Node temp=st.pop();
            while(temp.count>0){
                ans.append(temp.ch);
                temp.count=temp.count-1;
            }
        }
        return ans.reverse().toString();
    }
}