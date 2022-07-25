class Solution {
    public boolean isValid(String s) {
         Stack <Character> stack = new Stack<Character>();
        int stack_index = 0;

        if(s.length() % 2 != 0){
            return false;
        }
        if(s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']'){
            return false;
        }
        else if(s.charAt(s.length()-1) == '(' || s.charAt(s.length()-1) == '{' || s.charAt(s.length()-1) == '['){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
                stack_index++;
            }

            else if( s.charAt(i) == ')') {
                if(stack.isEmpty()){
                    return false;
                } else
                if(stack.get(stack_index-1) == '('){
                    stack.pop();
                    stack_index--;
                }
                else return false;
            }
            else if( s.charAt(i) == '}') {
                if(stack.isEmpty()){
                    return false;
                } else
                if(stack.get(stack_index-1) == '{'){
                    stack.pop();
                    stack_index--;
                }
                else return false;
            }
            else if( s.charAt(i) == ']') {
                if(stack.isEmpty()){
                    return false;
                } else
                if(stack.get(stack_index-1) == '['){
                    stack.pop();
                    stack_index--;
                }
                else return false;
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}