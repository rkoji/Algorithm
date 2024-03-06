import java.util.*;
class Solution {
    public List<String> solution(String myStr) {
        List<String> list = new ArrayList<>();
        String[] arr = myStr.split("[a-c]");
        for(int i = 0 ; i < arr.length ; i++){
            if(!arr[i].equals("")){
                list.add(arr[i]);
            }
        }
        if(list.size() == 0){
            list.add("EMPTY");
        }
     
        
        return list;
    }
}