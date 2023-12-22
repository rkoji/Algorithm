class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int count = 0;
        for(int x : arr){
            count += x;
        }
        answer = new int[count];
        
        int idx = 0;
        for(int i =0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                answer[idx++] = arr[i];
            }
        }
        return answer;
    }
}