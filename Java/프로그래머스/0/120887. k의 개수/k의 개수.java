class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int n = i; n <= j; n++){
            String num = String.valueOf(n);
            String target = String.valueOf(k);
            
            for(int m = 0; m < num.length(); m++){
                if(num.charAt(m) == target.charAt(0)){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}