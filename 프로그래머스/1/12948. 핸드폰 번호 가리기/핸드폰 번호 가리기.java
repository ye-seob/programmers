class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder(phone_number);
        int length = phone_number.length();
        
        StringBuilder starLength =new StringBuilder(); 
        
        for(int i = 0; i < length-4; i++){
            starLength.append('*');
        }
        
       answer.replace(0,length-4,starLength.toString());
        
        return answer.toString();
    }
}