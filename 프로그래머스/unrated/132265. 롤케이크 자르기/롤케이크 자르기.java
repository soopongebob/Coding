import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> older = new HashMap<>();
        Map<Integer, Integer> young = new HashMap<>();
        for(int i=0; i<topping.length; i++){
            older.put(topping[i], older.getOrDefault(topping[i], 0) + 1);
        }
        if(topping.length != 1){
            Integer num;
            for(int i=topping.length-1; i > 0; i--){
                num = Integer.valueOf(topping[i]);
                if(older.get(num) != null){
                    older.put(num, older.get(num)-1);
                }
                if(older.get(num) < 1){
                    older.remove(num);
                }
                young.put(num, young.getOrDefault(num, 0) + 1);
                if(older.size() < young.size()){
                    break;
                }
                if(older.size() == young.size()){
                    answer++;
                }
            }
        }
        return answer;
    }
}