class Solution {
    public String solution(String s) {
        int index = s.length() / 2;
        
        StringBuilder sb = new StringBuilder();
        
        
        
        if(s.length() % 2 == 0){
            sb.append(s.charAt(index-1));
            sb.append(s.charAt(index));
        }else{
            sb.append(s.charAt(index));
        }
        
        
        return sb.toString();
    }
}