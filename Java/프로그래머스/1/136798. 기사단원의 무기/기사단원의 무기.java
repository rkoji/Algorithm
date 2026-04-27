class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1 ; i <= number; i++){
            int count = getDivisorCount(i);
            if(count > limit){
                answer += power;
            }else{
                answer += count;
            }
        }
        
        
        return answer;
    }
    
    private int getDivisorCount(int num){
        int count = 0;
        for(int  i =1 ; i* i <= num; i++){
            if(i * i == num){
                count++;
            }else if ( num % i == 0){
                count += 2;
            }
        }
        return count;
        
    }
}