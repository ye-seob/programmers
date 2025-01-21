import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
      
        for (int i = 0; i < clothes.length; i++) {
            int count = map.getOrDefault(clothes[i][1], 0);
            map.put(clothes[i][1], count + 1);
        }
      
        int answer = 1;
        for (int count : map.values()) {
            answer *= (count + 1);
        }

        return answer -1 ;
    }
}
