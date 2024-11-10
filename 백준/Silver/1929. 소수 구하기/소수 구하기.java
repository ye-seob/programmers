import java.util.Scanner;

public class Main{
        public static boolean isPrime(int num){
            if (num <= 1) {
            return false;
                }
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
        }
    
		public static void main(String [] args){
		    Scanner sc = new Scanner(System.in);
            
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            for(int i = n; i <= m; i++){
                if(isPrime(i)){
                    System.out.println(i);
                }
            }
		}
}