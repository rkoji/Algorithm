import java.util.*;
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char c = letter.charAt(0);
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) != c){
                list.add(my_string.charAt(i));
            }
        }
        for(int i = 0; i < list.size(); i++){
            answer += list.get(i);
        }
        
        return answer;
    }
}