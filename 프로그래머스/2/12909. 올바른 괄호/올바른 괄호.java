import java.util.Stack;
class Solution {
 boolean solution(String s) {
     boolean answer;
     Stack<Character> stack = new Stack<>();
     
     if(s.charAt(0) == ')') return false;
     if(s.charAt(s.length() -1) == '(') return false;
     
     for(Character ch : s.toCharArray()){
         if(ch == '('){
             stack.push(ch);
         }else{
             if(stack.isEmpty()) return false;
             stack.pop();
         }
     }
     
     if(!stack.isEmpty()){
         return false;
     }
     return true;
    
 }
}