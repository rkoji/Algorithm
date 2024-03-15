import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length/2;
        
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < nums.length ; i++){
            hs.add(nums[i]);
        }
        if(n < hs.size()){
            answer = n;
        }else{
            answer = hs.size();
        }
        return answer;
    }
}