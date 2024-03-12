import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push('(');
            }else{
               if(!stack.isEmpty()){
                   stack.pop();
               }else{
                   return false;
               }
            }
        }

        return stack.isEmpty();
    }
}