class Solution {
    public Long solution(int[] a, int[] b) {
        Long sum = 0L;
        
        for(int i = 0; i < a.length; i++){
            sum = sum + a[i] * b[i];
        }
        
        return sum;
    }
}