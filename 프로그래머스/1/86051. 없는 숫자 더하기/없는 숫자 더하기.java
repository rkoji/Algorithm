class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        for(int x : numbers){
            sum -= x;
        }
        return sum;
    }
}