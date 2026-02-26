class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        int n = num1;
        for(int i = 0 ; i < numbers.length; i++){
            if(n <= num2){
                answer[i] = numbers[n];
                n++;
            }
        }
        return answer;
    }
}