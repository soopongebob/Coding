import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
                today = today.replaceAll("\\D", "");
        int todayInt = Integer.parseInt(today);
        List<Integer> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        for(int i=0; i<terms.length; i++){
            String[] tmp = terms[i].split(" ");
            map.put(tmp[0], tmp[1]);
        }
        int expYear = 0;
        int expMonth = 0;
        int expDay = 0;
        for(int i=0; i< privacies.length; i++){
            String pastDate = privacies[i].replaceAll("\\D", "");
            int pastYear = Integer.parseInt(pastDate)/10000;
            int pastMonth = Integer.parseInt(pastDate)/100%100;
            char type = privacies[i].charAt(privacies[i].length()-1);
            int addMonth = Integer.parseInt(map.get("" + type));
            int addYear = 0;

            if(pastMonth+addMonth > 12){
                addYear = (pastMonth + addMonth -1)/12;
                addMonth = (addMonth-(12*addYear));
            }
            expMonth = addMonth + pastMonth;
            expYear = addYear + pastYear;
            expDay = Integer.parseInt(pastDate) % 100;

            int expDate = expDay + (expMonth*100) + (expYear*10000);

            if(todayInt >= expDate){
                list.add(i+1);
            }
        }

        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}