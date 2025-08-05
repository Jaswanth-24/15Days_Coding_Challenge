class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]=='(' || ch[i]=='{' || ch[i]=='['){
                stack.push(ch[i]);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                if((stack.peek()=='(' && ch[i]==')') ||(stack.peek()=='{' && ch[i]=='}') || (stack.peek()=='[' && ch[i]==']')){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}