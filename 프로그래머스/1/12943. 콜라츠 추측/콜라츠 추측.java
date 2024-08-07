class Solution {
    public int solution(int num) {
        int answer = 0;
        long x = (long)num;
        while(x != 1){
            answer++;
            if(answer == 500){
                return -1;
            }else if(x % 2 ==0){
                x /= 2;    
            }else{
                x = x * 3 +1;
            }       
        }
        return answer;
    }
}