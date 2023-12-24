class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        String[] myArr = myString.split("");
        String[] patArr = pat.split("");
        int index = 0;
        for(int i = 0 ; i < myArr.length ; i++){
            for(int j = 0; j < patArr.length ; j++){
                if(myArr[i].equals(patArr[j])){
                    index = i;
                }
            }
        }
        answer = myString.substring(0,index+1);
        return answer;
    }
}