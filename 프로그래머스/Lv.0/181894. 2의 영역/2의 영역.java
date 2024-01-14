import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> index = new ArrayList<Integer>();
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 2){
                count++;
                index.add(i);
            }
        }
        if(count == 0){
            return new int[]{-1};
        }else if(count == 1){
            answer = new int[]{arr[index.get(0)]};
        }else{
            int startIndex = index.get(0);
            int endIndex = index.get(index.size()-1);
            answer = Arrays.copyOfRange(arr,startIndex,endIndex+1);
        }
        return answer;  
    }
}