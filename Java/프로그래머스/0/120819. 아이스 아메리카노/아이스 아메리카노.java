class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int price = 5500;
        if(money >= price){
            answer[0] = money/price;
        }
        answer[1] = money - answer[0] * price;
        return answer;
    }
}