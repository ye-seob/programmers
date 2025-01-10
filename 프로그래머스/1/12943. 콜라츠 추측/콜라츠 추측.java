class Solution {
    public int solution(int num) {
        int count = 0;
        
        while(count != 400 && num != 1){
            if(num % 2 == 0) num /= 2;
            else num = num * 3 + 1;
            
            count++;
        }
        
        if(count == 400) return -1;
        
        return count;
    }
}