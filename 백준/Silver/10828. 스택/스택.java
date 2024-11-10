import java.util.Scanner;
import java.util.Stack;

public class Main{
		public static void main(String [] args){
		    Scanner input = new Scanner(System.in);
            Stack<Integer> stack = new Stack<>();
            
            int n = input.nextInt();
            String s;
            int num;
            
            for(int i = 0; i < n; i++){
                s = input.next();
                
                if(s.equals("push")){
                    num = input.nextInt();
                    stack.push(num);
                }else if (s.equals("pop")){
                    if(stack.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(stack.pop());
                    }
                    
                }else if(s.equals("size")){
                    System.out.println(stack.size());
                }else if(s.equals("empty")){
                     if(stack.isEmpty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                }else{
                    if(stack.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(stack.peek());
                    }
                    
                }
            }
            
            
		}
}