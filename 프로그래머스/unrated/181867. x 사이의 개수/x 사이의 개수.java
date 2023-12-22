import java.util.*;
class Solution {
    public ArrayList<Integer> solution(String myString) {
        String[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        answer = myString.split("x",myString.length());
        for(int i = 0 ; i < answer.length; i++){
            String str = answer[i];
            list.add(str.length());
        }
        return list;
    }
}