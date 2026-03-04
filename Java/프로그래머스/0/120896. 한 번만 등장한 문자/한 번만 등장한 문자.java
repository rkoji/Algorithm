import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) +1);
            }else{
                map.put(c, 1);
            }
        }
        
        for(char key : map.keySet()){
            if(map.get(key) == 1){
                sb.append(key);
            }
        }
        
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
                
        return new String(arr);
    }
}