import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        int cnt = 0;
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> next = null;
        set.add(x);
        while(!set.isEmpty()){
            if(set.contains(y)){
                return cnt;
            }
            next = new HashSet<>();
            for(Integer num : set){
                int valB = num * 2;
                int valT = num * 3;
                int valN = num + n;
                if(valB <= y) next.add(valB);
                if(valT <= y) next.add(valT);
                if(valN <= y) next.add(valN);
            }
            set = next;
            cnt++;
        }
        return -1;
    }
}