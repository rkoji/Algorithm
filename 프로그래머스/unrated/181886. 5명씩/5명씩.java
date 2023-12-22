import java.util.*;
class Solution {
    public ArrayList<String> solution(String[] names) {
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0 ; i < names.length; i++){
            if(i % 5 == 0){
                result.add(names[i]);
            }
        }
        return result;
    }
}