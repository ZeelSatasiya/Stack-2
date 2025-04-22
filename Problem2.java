class Solution {
    public boolean isValid(String s) {
        if (s == null) return false;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }
            else{
                if(!st.isEmpty()){
                    char top = st.pop();
                    if((top == '(' && c == ')') || (top == '[' && c == ']') || (top == '{' && c == '}')){
                        continue;
                    }
                    else{
                        return false;
                    }

                }
                else{
                        return false;
                }
            }

        }
        if(!st.isEmpty()) return false;
        return true;
      
    }
}
