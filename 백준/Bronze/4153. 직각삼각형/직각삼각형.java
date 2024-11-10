import java.util.Scanner;

public class Main{
		public static void main(String [] args){
		    Scanner sc = new Scanner(System.in);
            
            int A,B,C;
            
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();
            
            while(A != 0){
                if(Math.pow(C,2) == Math.pow(A,2) + Math.pow(B,2)){
                    System.out.println("right");
                }
                else if(Math.pow(A,2) == Math.pow(C,2) + Math.pow(B,2)){
                    System.out.println("right");
                }
                else if(Math.pow(B,2) == Math.pow(A,2) + Math.pow(C,2)){
                    System.out.println("right");
                }

                else{
                    System.out.println("wrong");
                }
                
                A = sc.nextInt();
                B = sc.nextInt();
                C = sc.nextInt();
            }
            
            
		}
}