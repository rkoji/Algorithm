class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] month = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        
        int sum = 0;
        int idx = 0;
        for(int i = 0; i < a - 1; i++){
            sum += days[i];
        }
        
       
        int day = (sum + b - 1 + 4 ) % 7;;

        answer = month[day];
        
        return answer;
    }
}