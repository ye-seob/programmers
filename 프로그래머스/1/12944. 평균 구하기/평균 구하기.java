class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        double avg;
        
        for(int num : arr){
            sum += num;
        }
        
        avg = (double) sum / arr.length;
        
        return avg;
        
    }
}