import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue<String> cardsOne = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> cardsTwo = new LinkedList<>(Arrays.asList(cards2));
        int idx = 0;
        while(idx != goal.length){
            if(!cardsOne.isEmpty() && cardsOne.peek().equals(goal[idx])){
                cardsOne.poll();
                idx++;
            }else if(!cardsTwo.isEmpty() && cardsTwo.peek().equals(goal[idx])){
                cardsTwo.poll();
                idx++;
            }else{
                answer = "No";
                break;
            }
        }
        return answer;
    }
}