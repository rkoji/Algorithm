import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String str = my_string.replaceAll("[^0-9]","");
        char[] chrArray = str.toCharArray();
        int[] answer = new int[chrArray.length];
        for(int i = 0; i < chrArray.length; i++){
            answer[i] = chrArray[i] -'0';
        }
        Arrays.sort(answer);
        return answer;
    }
}