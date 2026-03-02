class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] array = my_string.toCharArray();
        for(int i = 0; i < array.length; i++){
            if(answer.indexOf(array[i]) == -1){
                answer += array[i];
            }
        }
        return answer;
    }
}