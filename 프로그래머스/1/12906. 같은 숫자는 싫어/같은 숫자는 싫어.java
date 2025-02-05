import java.util.*;
import java.util.Stack;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i : arr) {
            
            try{
                if(stack.peek() != i)
                    stack.push(i);
            }
            catch(Exception e){
                stack.push(i);
            }
        }
        
        int[] answer = new int[stack.size()];
        
        for(int i=answer.length-1;i>=0;i--){
            answer[i]=stack.pop();
        }
        
        
        return answer;
    }
}