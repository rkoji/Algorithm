class Solution {
    public int[][] solution(int[] num_list, int n) {
        int num = num_list.length / n;
        int[][] answer = new int[num][n];
        
        int count = 0;
        for(int i = 0; i < answer.length; i++){
            for(int k = 0; k < answer[i].length; k++){
                answer[i][k] = num_list[count];
                count++;
            }
        }
        return answer;
    }
}