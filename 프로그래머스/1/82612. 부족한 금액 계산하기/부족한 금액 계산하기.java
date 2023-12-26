class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        for(int i = 1 ; i <= count ; i++){
            sum += (long)(i * price);
        }
        if(money < sum){
            answer = sum - (long)money;
        }else{
            answer = 0;
        }

        return answer;
    }
}