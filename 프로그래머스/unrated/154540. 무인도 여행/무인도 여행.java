import java.util.*;
class Solution {
    public int[] solution(String[] maps) {
        int[] answer = {};
        String[][] map = new String[maps.length][maps[0].length()];
        boolean[][] visit = new boolean[maps.length][maps[0].length()];
        for(int i=0; i<map.length; i++){
            map[i] = maps[i].split("");
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++){
                int sum = search(visit, map, i, j);
                if(sum > 0){
                    list.add(sum);
                }
            }
        }

        if(list.size() != 0){
            answer = new int[list.size()];
            Collections.sort(list);
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
        }else{
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
    
    public int search(boolean[][] visit, String[][] map, int y, int x){
        if(x < 0 || y < 0 || x == map[0].length || y == map.length){
            return 0;
        }
        if(visit[y][x] || map[y][x].equals("X")){
            return 0;
        }
        visit[y][x] = true;

        int sum = Integer.valueOf(map[y][x]);
        sum += search(visit, map, y-1, x);
        sum += search(visit, map, y+1, x);
        sum += search(visit, map, y, x-1);
        sum += search(visit, map, y, x+1);

        return sum;
    }
}