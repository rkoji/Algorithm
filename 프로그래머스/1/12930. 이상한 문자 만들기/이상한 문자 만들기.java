class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                answer += " ";
                cnt = 0;
            } else {
                if (cnt % 2 == 0) {
                    answer += Character.toUpperCase(arr[i]);
                    cnt++;
                } else {
                    answer += Character.toLowerCase(arr[i]);
                    cnt++;
                }
            }
         
        }
        return answer;
    }
}