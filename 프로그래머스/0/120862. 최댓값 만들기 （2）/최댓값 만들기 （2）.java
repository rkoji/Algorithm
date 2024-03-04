class Solution {
    public int solution(int[] numbers) {
        int maxNum = Integer.MIN_VALUE;
        for(int i = 0 ; i < numbers.length -1 ; i++){
            for(int j = i +1; j < numbers.length ; j++){
                if(numbers[i] * numbers[j] > maxNum){
                    maxNum = numbers[i] * numbers[j];
                }
            }
        }
        return maxNum;
    }
}