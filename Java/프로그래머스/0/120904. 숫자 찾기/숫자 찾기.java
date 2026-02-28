class Solution {
    public int solution(int num, int k) {
        String str = String.valueOf(num);
        String target = String.valueOf(k);
        
        int idx = str.indexOf(target);
        
        return (idx != -1) ? idx + 1 : -1;
    }
}