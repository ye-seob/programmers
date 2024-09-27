class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        
        int p_num = 0;
        int y_num = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p') p_num++;
            if(s.charAt(i) == 'y') y_num++;
        }
        
        if(p_num == y_num) return true;
        return false;
    } 
}