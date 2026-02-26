class Solution {
    public int solution(int n) {
        double answer = 0;
        if(n == 1){
            return 1;
        }
        answer =Math.ceil((double)n/7);
        return (int)answer;
    }
}