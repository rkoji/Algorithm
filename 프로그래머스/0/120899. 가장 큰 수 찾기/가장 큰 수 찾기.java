class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int maxNum = -1;
        int index = -1;
        
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] > maxNum){
                maxNum = array[i];
                index = i;
            }
        }
        answer[0] = maxNum;
        answer[1] = index;
        return answer;
    }
}