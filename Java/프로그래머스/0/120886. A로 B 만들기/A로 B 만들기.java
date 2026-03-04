import java.util.*;
class Solution {
    public int solution(String before, String after) {
        String[] b = before.split("");
        String[] a = after.split("");
        
        Arrays.sort(b);
        Arrays.sort(a);
        
        if(Arrays.equals(b,a)){
            return 1;
        }else{
            return 0;
        }
    }
}