import java.util.*;
class Solution {
    public long solution(long n) {
        double x = Math.sqrt(n);
        if(x == Math.floor(x)){
            return (long)((x+1) * (x+1));
        }else{
            return -1;
        }
    }
}