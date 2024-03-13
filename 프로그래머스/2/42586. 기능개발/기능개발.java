import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        int[] arr = new int[speeds.length];

        
        for(int  i = 0 ; i < speeds.length ; i++){
            if((100 - progresses[i]) % speeds[i] == 0){
                arr[i] = (100 - progresses[i]) / speeds[i];
            }else{
                arr[i] = (100 - progresses[i]) / speeds[i] + 1;
            } 
        }
       
        IntStream.of(arr).forEach(y -> deque.addLast(y));
        
       int cnt = 0; // 루프 밖에서 초기화
        int x = deque.peekFirst();
        while (!deque.isEmpty()) {
            if (deque.peekFirst() > x) {
                x = deque.pollFirst();
                list.add(cnt);
                cnt = 1;
            } else {
                deque.pollFirst();
                cnt++;
            }
        }

        // 마지막 그룹의 개수 추가
        list.add(cnt);
                
        return list;
    }
}