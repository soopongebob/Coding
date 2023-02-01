import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<want.length; i++){
            map.put(want[i], number[i]);
        }
        Map<String, Integer> tmp = new HashMap<>();
        for(int i=0; i<discount.length; i++){
            int tmpSum = 0;
            if(i + 10 > discount.length){
                break;
            }
            for(int k=i; k<10+i; k++){
                tmp.put(discount[k], tmp.getOrDefault(discount[k], 0) + 1);
            }
            for(int j=0; j<want.length; j++){
                String key = want[j];
                if(tmp.get(key) == null){
                    break;
                }
                if(map.get(key).intValue() > tmp.get(key).intValue()){
                    break;
                }
                tmpSum += map.get(key);
            }
            tmp.clear();
            if(tmpSum == 10){
                answer++;
            }
        }
        return answer;
    }
}