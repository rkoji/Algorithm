class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        for(int i = 0 ; i < num_list.length ; i++){
            answer[i] = num_list[i];
        }
        
        int x = num_list[num_list.length -2];
        int y = num_list[num_list.length -1];
        
        answer[answer.length -1 ] = y > x ? y - x : y *2;
        
        return answer;
    }
}