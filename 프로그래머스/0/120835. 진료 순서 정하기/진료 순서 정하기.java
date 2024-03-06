class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i = 0 ; i < emergency.length ; i++){
            int idx = 1;
            int count = 1;
            for(int j = 0 ; j <emergency.length;j++){
                if(i != j && emergency[i] < emergency[j]){
                    count++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}