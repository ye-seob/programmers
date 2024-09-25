class Solution {
    public int solution(String s) {
        if(s.charAt(0) == '-') {
            String t = s.substring(1);
            return -Integer.parseInt(t);
        }
        
        return Integer.parseInt(s);
    }
}