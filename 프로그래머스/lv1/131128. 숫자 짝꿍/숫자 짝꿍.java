import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        int[] arrX = new int[10];
        int[] arrY = new int[10];

        for(int i=0; i<X.length(); i++){
            int idx = X.charAt(i) - '0';
            arrX[idx]++;
        }
        for(int i=0; i<Y.length(); i++){
            int idx = Y.charAt(i) - '0';
            arrY[idx]++;
        }
        
        for(int i=9; i>=0; i--){
            while(arrX[i] > 0 && arrY[i] > 0){
                sb.append(i);
                
                arrX[i]--;
                arrY[i]--;
            }
        }
        if(sb.toString().equals("")){
            answer = "-1";
        }else if (sb.toString().startsWith("0")){
            answer = "0";
        }else{
            answer = sb.toString();
        }

        return answer;
    }
}