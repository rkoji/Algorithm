import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int idx = 0;
        int[] answer = new int[queries.length];
        for(int[] query :  queries){
            int x = query[0];
            int y = query[1];
            int z = query[2];
            
            int min = Integer.MAX_VALUE;
        
            for(int i = x ; i <= y ; i++){
                if(arr[i] > z){
                    min = Math.min(arr[i],min);
                }
            }
            answer[idx++] = min == Integer.MAX_VALUE ? -1 : min;
        }
        return answer;
    }
}