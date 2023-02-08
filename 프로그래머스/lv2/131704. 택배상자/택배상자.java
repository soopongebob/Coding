import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
                Stack<Integer> container = new Stack<>();
        Stack<Integer> subCon = new Stack<>();
        for(int i=order.length; i>0; i--){
            container.push(i);
        }

        int idx = 0;
        boolean con = false;
        boolean sCon = false;
        while(idx < order.length){
            while(!container.isEmpty()){
                int tmp = container.peek();
                if(tmp == order[idx]){
                    container.pop();
                    idx++;
                    answer++;
                    con = true;
                    break;
                }else{
                    con = false;
                    subCon.add(container.pop());
                }
            }
            while(!subCon.isEmpty()){
                int tmp = subCon.peek();
                if(tmp == order[idx]){
                    subCon.pop();
                    idx++;
                    answer++;
                    sCon = true;
                }else{
                    sCon = false;
                    break;
                }
            }
            if(!sCon && !con){
                break;
            }
        }
        return answer;
    }
}