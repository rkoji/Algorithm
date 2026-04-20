import java.util.*;
class Solution {
    public boolean solution(int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int init = x;
        while(x > 0){
            list.add(x % 10);
            x /= 10;
        }
        
        int sum = 0;
        for(int num : list){
            sum += num;
        }
        
        if(init % sum == 0){
            return true;
        }
        
        return false;
    }
}