class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int length = included.length;
        int[] arr =  new int[length];
        for(int i = 0; i < length ; i++){
           arr[i] += a + (i *d);
        }
        for(int i = 0 ; i < included.length; i++){
            if(included[i] == true){
                answer += arr[i];
            }
        }

        return answer;
    }
}