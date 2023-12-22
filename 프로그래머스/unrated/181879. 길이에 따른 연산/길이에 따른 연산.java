class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiply = 1;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list.length <= 10) {
                multiply *= num_list[i];
                answer = multiply;
            } else {
                answer += num_list[i];
            }
        }

        return answer;
    }
}