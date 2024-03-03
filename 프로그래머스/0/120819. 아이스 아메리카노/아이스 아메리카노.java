class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int americano = 5500;
        int count = money / americano;
        int change = money % americano;
        answer[0] = count;
        answer[1] = change;
        return answer;
    }
}