import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Math.abs(array[0] - n);
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            int diff = Math.abs(array[i] - n);
            if (diff < min || (diff == min && array[i] < array[index])) {
                min = diff;
                index = i;
            }
        }

        answer = array[index];
        return answer;
    }
}