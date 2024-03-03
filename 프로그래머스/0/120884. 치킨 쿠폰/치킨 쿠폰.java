class Solution {
    public int solution(int chicken) {
        int answer = 0;
        while(chicken >= 10){
            int newCoupon = chicken / 10;
            int remainCoupon = chicken % 10;
            chicken = newCoupon + remainCoupon;
            
            answer += newCoupon;
        }
        return answer;
    }
}