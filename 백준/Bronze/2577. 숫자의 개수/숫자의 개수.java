import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int [] answer = new int[10];
        
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        
        long mult = A * B * C;
        
        String s = Long.toString(mult);
        
        for(int i = 0; i < s.length(); i++){
           answer[Character.getNumericValue(s.charAt(i))]++;
        }
        
        for(int a : answer){
            System.out.println(a);
        }
        
        
        
    }
}