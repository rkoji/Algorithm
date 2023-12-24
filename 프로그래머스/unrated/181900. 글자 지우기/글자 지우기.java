class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        boolean isDeleted[] = new boolean[my_string.length()];
        for(int x : indices){
            isDeleted[x] = true;
        }
        for(int i = 0 ; i < my_string.length(); i++){
            if(isDeleted[i]){
                continue;
            }else{
                sb.append(my_string.charAt(i));
            }
        }
        answer = sb.toString();
        return answer;
    }
}