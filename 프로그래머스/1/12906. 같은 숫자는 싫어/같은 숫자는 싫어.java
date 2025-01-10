import java.util.ArrayList;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int before = -1;
        for(int num : arr){
            if(num != before){
                list.add(num);
                before = num;
            }
        }
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }
}