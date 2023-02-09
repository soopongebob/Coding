import java.util.*;
class Solution {
    public int solution(int[] cards) {
        int answer = 0;
        boolean[] visited = new boolean[cards.length];
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<cards.length; i++){
            int idx = i;
            int cnt = 0;
            while(true){
                if(!visited[idx]){
                    visited[idx] = true;
                    cnt++;
                    idx = cards[idx]-1;
                }else{
                    list.add(cnt);
                    break;
                }
            }
        }

        list.sort(Collections.reverseOrder());
        if(list.size() == 1){
            answer = 0;
        }else{
            answer = list.get(0) * list.get(1);
        }
        return answer;
    }
}