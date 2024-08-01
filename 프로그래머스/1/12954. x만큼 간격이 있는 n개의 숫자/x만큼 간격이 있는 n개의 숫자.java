class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num =0;
        for(int i = 0; i < answer.length ;i++){
            if(i ==0){
                answer[i] = x;
                num =x;
            }else{
                answer[i] = num+x;
                num += x;
            }
        }
        return answer;
    }
}