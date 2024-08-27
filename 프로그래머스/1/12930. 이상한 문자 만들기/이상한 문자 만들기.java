import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int cnt = 0;
        char[] array = s.toCharArray(); 

        for (char c : array) {
            if (c == ' ') {  
                answer.append(c); 
                cnt = 0;
            } else {
                if (cnt % 2 == 0) {
                    answer.append(Character.toUpperCase(c)); 
                } else {
                    answer.append(Character.toLowerCase(c));  
                }
                cnt++; 
            }
        }
        return answer.toString();  
    }
}