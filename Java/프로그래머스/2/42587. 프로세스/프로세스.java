import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> q = new LinkedList<>();
        
        for(int i = 0; i < priorities.length; i++){
            q.offer(new int[]{priorities[i],i});
        }
        
          int count = 0;
        
        while(!q.isEmpty()){
            int[] arr = q.poll();
            
          
            
            boolean isHigher = false;
            
            for(int[] x : q){
                if(x[0] > arr[0]){
                    isHigher = true;
                    break;
                }
            } 
            
            if(isHigher){
                q.offer(arr);
            }else{
                count++;
                if(arr[1] == location){
                    return count;                     
                }
            }
        }
        return count;
    }
}