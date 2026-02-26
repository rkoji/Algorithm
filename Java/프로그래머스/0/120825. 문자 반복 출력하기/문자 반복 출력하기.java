class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] charArray = my_string.toCharArray();
        for(int i = 0; i< charArray.length;i++){
            int num = 0;
            while(num < n){
                answer += charArray[i];
                num++;
            }
        }
        
        return answer;
    }
}