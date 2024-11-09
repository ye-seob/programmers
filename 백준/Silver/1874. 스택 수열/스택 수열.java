import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int target = 0;

        for (int i = 1; i <= n; i++) {
            stack.push(i);
            sb.append("+\n"); 

            while (!stack.isEmpty() && stack.peek() == arr[target]) {
                stack.pop();
                sb.append("-\n");
                target++;
            }
        }

        if (stack.isEmpty()) {
            System.out.print(sb);
        } else {
            System.out.println("NO");
        }
    }
}
