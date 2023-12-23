class Solution {
    public String solution(String n_str) {
        String answer = "";
        int count = 0;
        while(n_str.charAt(count) == '0'){
            count++;
        }
        answer = n_str.substring(count,n_str.length());
        return answer;
    }
}