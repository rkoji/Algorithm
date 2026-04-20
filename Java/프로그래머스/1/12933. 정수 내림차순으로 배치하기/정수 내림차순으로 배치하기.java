import java.util.*;
class Solution {
    public long solution(long n) {
        String[] arr =  String.valueOf(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        
        String joined = String.join("",arr);
        return Long.parseLong(joined);
    }
}