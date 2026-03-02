class Solution {
    public String solution(int age) {
        String answer = "";
        String str = String.valueOf(age);
        char[] array = str.toCharArray();
        
        for(int i = 0 ; i < array.length; i++){
            answer += (char)(array[i] - '0' + 'a');
        }
        return answer;
    }
}