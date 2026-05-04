import java.util.*;
class Solution {
    boolean solution(String s) {
        Queue<Character> q = new LinkedList<>();
        
        for(char c : s.toCharArray()){
            if(c == '('){
                q.offer(c);
            }else{
                if(q.isEmpty()){
                    return false;
                }
                q.poll();
            }
        }
        
        return q.isEmpty();
    }
}