import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Hashtable<String,Integer> ht = new Hashtable<>();
        for(String name : completion){
            ht.put(name,ht.getOrDefault(name, 0) + 1);
        }
        
        for(String name : participant){
            if(ht.containsKey(name) && ht.get(name) > 0){
                ht.put(name,ht.get(name) - 1);
            }else{
                answer = name;
                break;
            }
        }
        
        return answer;
    }
}