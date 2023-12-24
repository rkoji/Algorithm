import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        StringBuilder str2 = new StringBuilder(new String(arr));
        str2.reverse();
        return Long.parseLong(str2.toString());
    }
}