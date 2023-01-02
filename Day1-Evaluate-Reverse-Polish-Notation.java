
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<tokens.length;i++){
            try{
                int num=Integer.parseInt(tokens[i]);
                st.push(num);
            }
            catch(Exception E){
                char ch=tokens[i].charAt(0);
                
                int a=st.pop();
                int b=st.pop();
                if(ch=='+'){
                    st.push(a+b);
                }
                if(ch=='-'){
                    st.push(b-a);
                }
                if(ch=='*'){
                    st.push(a*b);
                }
                if(ch=='/'){
                    st.push(b/a);
                }
            }
            
        }
        return st.pop();
    }
}
