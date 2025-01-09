//0부터 9의합에서 numbers 원소들의 합을 뺸 값을 리턴
class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        
        for(int num : numbers){
            sum += num;
        }
        
        return 45 - sum;
    }
}