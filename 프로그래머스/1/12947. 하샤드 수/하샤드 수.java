class Solution {
    public boolean solution(int x) {
        String s = x + "";
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += Character.getNumericValue(s.charAt(i));
        }
        if(x % sum == 0) return true;
        return false;
    }
}