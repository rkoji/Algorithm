class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        String arr[] = code.split("");
        for (int i = 0; i < arr.length; i++) {
            if (mode == 0) {
                if (!arr[i].equals("1") && i % 2 == 0) {
                    ret += arr[i];
                } else if (arr[i].equals("1")) {
                    mode = 1;
                }
            } else if (mode == 1) {
                if (!arr[i].equals("1") && i % 2 != 0) {
                    ret += arr[i];
                } else if (arr[i].equals("1")) {
                    mode = 0;
                }
            }
        }
        if(ret.equals("")){
            ret += "EMPTY";
        }
        return ret;
    }
}