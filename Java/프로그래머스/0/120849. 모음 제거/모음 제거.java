class Solution {
    public String solution(String my_string) {
        String[] alphabet = {"a","e","i","o","u"};
        for(int i = 0; i < alphabet.length; i++){
            my_string = my_string.replace(alphabet[i],"");
        }
        return my_string;
    }
}