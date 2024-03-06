class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        for(int i = 1 ; i <= n ; i++){
            num *= i;
            if(num == n){
                answer = i;
                break;
            }else if(n < num){
                answer = i-1;
                break;
            }
        }
        return answer;
    }
}