import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < numbers.length ; i++){
            for(int j = 0 ; j < numbers.length ; j++){
                if( i != j){
                    set.add(numbers[i]+numbers[j]);
                }
            }
        }
        
         return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}