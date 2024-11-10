import java.util.Scanner;

class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[6];
        
        int N = sc.nextInt();
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int T = sc.nextInt();
        int P = sc.nextInt();
        
        int sum = 0;
        for(int num : arr){
            if(num % T == 0){
                sum += num / T;
            }else{
                 sum += (num / T) + 1;
            }
           
        }
        System.out.println(sum);
        System.out.println(N / P + " " + N % P);
       
        
        
    }
}