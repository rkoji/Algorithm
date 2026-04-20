class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        for(int i = 1; i <= 9; i++){
            sum += i;
        }
        
        int arrSum = 0;
        for(int i = 0; i < numbers.length; i++){
            arrSum += numbers[i];
        }
    
        return sum - arrSum;
    }
}