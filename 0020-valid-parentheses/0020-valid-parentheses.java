class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> st=new Stack();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='['||ch=='{'){
                st.push(ch);
            }
            else if(st.isEmpty()){
                return false;
            }
            else{
                char val=st.pop();
                if((ch==')'&& val!='(')||
					(ch=='}'&& val!='{')||
					(ch==']'&& val!='[')){
					return false;
                    }
            
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}