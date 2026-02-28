class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        char[] charArray = cipher.toCharArray();
        for(int i = code-1; i < charArray.length; i += code){
            answer += charArray[i]; 
        }
        return answer;
    }
}