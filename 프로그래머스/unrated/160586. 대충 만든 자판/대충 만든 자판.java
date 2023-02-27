import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<keymap.length; i++){
            for(int j=0; j<keymap[i].length(); j++){
                char str = keymap[i].charAt(j);
                if(map.get(str) != null){
                    if(map.get(str) < j+1){
                        continue;
                    }
                }
                map.put(str, j+1);
            }
        }
        for(int i=0; i<targets.length; i++){
            for(int j=0; j<targets[i].length();j++){
                char str = targets[i].charAt(j);
                if(!map.containsKey(str)){
                    answer[i] = -1;
                    break;
                }else{
                    answer[i] += map.get(str);
                }
            }
        }
        return answer;
    }
}