class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] arr = s.split("");
        answer[0] = -1;
        for(int i = 1 ; i < arr.length ; i++){
            answer[i] = -1;
            for(int j = i -1 ; j >=0 ; j--){
                if(arr[i].equals(arr[j])){
                    answer[i] = i - j;
                    break;
                }
            }
        }
        return answer;
    }
}