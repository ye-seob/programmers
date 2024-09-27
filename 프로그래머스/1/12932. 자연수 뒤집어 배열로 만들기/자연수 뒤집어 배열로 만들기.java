class Solution {
    public int[] solution(long n) {
        String s = n + "";
        int[] arr = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            arr[i] =  Character.getNumericValue(s.charAt(s.length()-i-1));
        }
        
        return arr;
    }
}