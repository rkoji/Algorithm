class Solution {
    public int solution(int hp) {
        int answer = 0;
        int Ant1 = 5;
        int Ant2 = 3;
        int Ant3 = 1;
        
        if(hp > Ant1){
            answer += hp / Ant1;
            hp = hp % Ant1;
        }
        
        if(hp >= Ant2){
            answer += hp / Ant2;
            hp = hp % Ant2;
        }
        
        if(hp >= Ant3){
            answer += hp / Ant3;
            hp = hp % Ant3;
        }
        
        return answer;
    }
}