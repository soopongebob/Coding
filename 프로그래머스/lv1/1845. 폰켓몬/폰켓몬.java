import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for(int i=0; i<set.size(); i++){
            if(i == nums.length/2){
                break;
            }
            answer++;
        }
        
        return answer;
    }
}