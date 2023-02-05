import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] ss = s.toCharArray();
        for(int i=0; i<ss.length; i++){
            for(int j=0; j<index; j++){
                ss[i]++;
                if(ss[i] > 'z'){
                    ss[i] -= 26;
                }
                if(skip.contains(String.valueOf(ss[i]))){
                    j--;
                }
            }
            answer += ss[i];
        }
        return answer;
    }
}