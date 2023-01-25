import java.lang.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        Long pNum = Long.parseLong(p);
        int len = p.length();
        for(int i=0; i<=t.length()-len; i++){
            if(Long.parseLong(t.substring(i,i+len)) <= pNum){
                answer++;
            }
        }
        return answer;
    }
}