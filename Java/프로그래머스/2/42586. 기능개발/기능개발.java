import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < speeds.length; i++){
            double num = (double)(100 - progresses[i]) / (double)speeds[i];
            int divisor = (int) Math.ceil(num);
            
            if(!q.isEmpty() && q.peek() < divisor){
                list.add(q.size());
                q.clear();
            }
            
            q.offer(divisor);
        }
        
        list.add(q.size());
        
        int[] answer = new int[list.size()];
        for(int i = 0 ; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}