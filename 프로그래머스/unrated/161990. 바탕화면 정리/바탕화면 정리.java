class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int xMin = 51;
        int xMax = 0;
        int yMin = 51;
        int yMax = 0;
        for(int x=0; x<wallpaper.length; x++){
            for(int y=0; y<wallpaper[x].length(); y++){
                if(wallpaper[x].charAt(y) == '#'){
                    if(yMin > y){
                        yMin = y;
                    }
                    if(yMax < y){
                        yMax = y;
                    }
                    if(xMin > x){
                        xMin = x;
                    }
                    if(xMax < x){
                        xMax = x;
                    }
                }
            }
        }
        answer[0] = xMin;
        answer[1] = yMin;
        answer[2] = xMax+1;
        answer[3] = yMax+1;
        return answer;
    }
}