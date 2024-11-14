import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Main{
		public static void main(String [] args){
		    Queue<Integer> queue = new LinkedList<Integer>();
            Scanner sc = new Scanner(System.in);
            
            int N = sc.nextInt();
            int tmp;
            for(int i =1; i <= N; i++){
                queue.add(i);
            }
            while(queue.size() != 1){
                queue.poll();
                tmp = queue.poll();
                queue.add(tmp);
            }
            System.out.println(queue.peek());
		}
}