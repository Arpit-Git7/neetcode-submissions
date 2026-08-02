class Solution {
    public boolean isValid(String s) {
        char[] num=s.toCharArray();
        int n=num.length;
        Stack<Character> stack=new Stack<>();
        for(char i:num){
            if(i=='('|| i=='{'|| i=='['){
                stack.push(i);
            }else if(i==')'||i==']'||i=='}'){
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if((i=='}'&&top!='{')||(i==')'&&top!='(')|| (i==']'&&top!='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
