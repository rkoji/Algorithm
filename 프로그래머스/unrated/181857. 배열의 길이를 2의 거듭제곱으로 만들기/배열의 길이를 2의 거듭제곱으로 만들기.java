import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int arrLength = arr.length;
        int num = 1;
        while(num < arrLength){
            num *= 2;
        }
        
        answer = new int[num];
        Arrays.fill(answer,0);
        System.arraycopy(arr,0,answer,0,arrLength);
        return answer;
    }
}