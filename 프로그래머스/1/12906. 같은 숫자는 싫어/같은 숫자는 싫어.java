import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int x = -1;
        for(int  i = 0; i < arr.length ; i++){
            if(arr[i] != x){
                x = arr[i];
                list.add(arr[i]);
            }else{
                continue;
            }
        }   
        return list;
    }
}