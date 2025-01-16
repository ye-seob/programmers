//같은 종류의 포켓몬은 같은 번호 
//N마리의 포켓몬 중 N/2마리를 가져가되
import java.util.Arrays;
//최대한 다양한 종류를 가져야함 
//nums 배열 종류 번호가 담김
//최대 종류 수 리턴
class Solution {
    public int solution(int[] nums) {
        int takedNum  = nums.length / 2;
        nums = Arrays.stream(nums).distinct().toArray();
        
        if(nums.length >= takedNum) return takedNum;
        return nums.length;
        
        
        
    }
}