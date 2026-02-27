import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] chr = my_string.toCharArray();
        for(int i = 0 ; i < chr.length; i++){
            if(Character.isUpperCase(chr[i])){
                answer += Character.toLowerCase(chr[i]);
            }else{
                answer += Character.toUpperCase(chr[i]);
            }
        }
        return answer;
    }
}