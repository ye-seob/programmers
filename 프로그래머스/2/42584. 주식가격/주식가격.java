import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>(); 
        
        stack.push(0);

        for (int i = 1; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int beforeIndex = stack.pop();
                answer[beforeIndex] = i - beforeIndex; 
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int remainIndex = stack.pop();
            answer[remainIndex] = prices.length - 1 - remainIndex;
        }

        return answer;
    }
}
