class Solution {
    static int answer = 0;
    public int solution(int[] number) {
        int n = number.length;
        int r = 3;
        boolean[] visited = new boolean[n];
        int start = 0;
        
        combination(number, visited, start, n, r);
        
        return answer;
    }
    public void combination(int[] arr, boolean[] visited, int start, int n, int r){
        if(r == 0){
            int sum = 0;
            for(int i=0; i<n; i++){
                if(visited[i]){
                    sum += arr[i];
                }
            }
            if(sum == 0){
                answer++;
            }
        }
        for(int i=start; i<n; i++){
            if(!visited[i]){
                visited[i] = true;
                combination(arr, visited, i+1, n, r-1);
                visited[i] = false;
            }
        }
    }
}