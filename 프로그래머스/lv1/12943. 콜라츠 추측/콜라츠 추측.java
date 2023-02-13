class Solution {
    public int solution(int num) {
        int answer = 0;
        int cnt = 0;
        long number = num;
        while(number != 1){
            if(number % 2 == 0){
                number /= 2;
            }else{
                number = number * 3 + 1;
            }
            answer++;
            cnt++;
            if(cnt == 500){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}