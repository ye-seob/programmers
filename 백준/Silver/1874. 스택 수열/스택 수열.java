import java.util.Stack;
import java.util.Scanner;
import java.util.Arrays;

public class Main{
		public static void main(String [] args){
		    Stack<Integer> stack = new Stack<>(); //스택
            Scanner input = new Scanner(System.in);
            StringBuilder sb = new StringBuilder();
            
            int n = input.nextInt(); //정수 범위 n
            
            int [] arr = new int[n]; //주어지는 수열
            int [] answer = new int[n]; 
            for(int i =0; i < n; i++){
                arr[i] = input.nextInt();
            }
            int target = 0;
            
           
            for(int i = 1; i <= n; i++){
                stack.push(i);
                sb.append('+');
                while(!stack.isEmpty() && stack.peek() == arr[target]){
                    sb.append('-');
                    answer[target++] = stack.pop();
                    
                }
            }
            
            if(Arrays.equals(arr, answer)){
                for (int i = 0; i < sb.length(); i++) {
                    System.out.println(sb.charAt(i));
                }
            }else{
                System.out.println("NO");
            }
            
		}
}