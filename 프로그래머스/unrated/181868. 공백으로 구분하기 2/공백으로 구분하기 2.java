class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        answer = my_string.strip().split("\\s+");
        return answer;
    }
}