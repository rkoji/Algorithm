class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int l = i ; l <= j ;l++){
            int temp = l;
            while(temp > 0){
                int digit = temp % 10;
                if(digit == k){
                    answer++;
                }
                temp /= 10;
            }
        }
        return answer;
    }
}