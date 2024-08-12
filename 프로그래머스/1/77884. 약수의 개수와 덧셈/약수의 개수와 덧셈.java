class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int sum = 0;
        for(int i = left; i <= right ; i++){
            answer =0;
            for(int k = 1 ; k <= i ; k++){
                if( i % k == 0){
                    answer++;
                }
            }
            if(answer % 2 == 0){
                sum += i;
            }else{
                sum -= i;
            }
           
        }
        return sum;
    }
}