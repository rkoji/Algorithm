import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i = 0; i < arr.length; i++){
            if(!stack.isEmpty() && stack.peek() != arr[i]){
                stack.push(arr[i]);
            }else if(stack.isEmpty()){
                stack.push(arr[i]);
            }
        }
        
        int[] answer = new int[stack.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = stack.pollLast();
        }
        
        return answer;
    }
}