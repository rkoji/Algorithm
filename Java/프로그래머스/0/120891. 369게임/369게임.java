import java.util.*;
class Solution {
    public int solution(int order) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(order > 0){
            list.add(order % 10);
            order /= 10;
        }
        
        for(int i = 0; i < list.size(); i++){
            int num = list.get(i);
            if(num == 3 || num == 6 || num == 9){
                answer++;
            }
        }
        return answer;
    }
}