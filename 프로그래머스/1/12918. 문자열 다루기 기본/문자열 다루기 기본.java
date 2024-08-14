import java.util.*;
class Solution {
    public boolean solution(String s) {
        boolean answer = s.chars().allMatch(Character::isDigit);
        if(s.length() == 4 || s.length() == 6){
            if(answer == true){
                return true;
            }else{
                return false;
            }
        }else{
         return false;   
        }
    }
}