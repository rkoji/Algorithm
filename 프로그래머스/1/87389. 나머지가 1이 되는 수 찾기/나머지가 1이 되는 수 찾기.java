class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = 0;
        for(int i = 1; i  <= n ; i++){
            x = n % i;
            if(x == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}