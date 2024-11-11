import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        
        
        int N = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        String[] arr = str.split(" ");
        
        
        for (int i = 0; i < N; i++) {
            hm.put(arr[i], 1);  
        }
        
       
        int M = Integer.parseInt(bf.readLine());
        String str2 = bf.readLine();
        String[] arr2 = str2.split(" ");
        
        // arr2의 값들을 확인하고, HashMap에 해당 키가 존재하는지 확인
        for (int j = 0; j < M; j++) {
            // 키가 존재하면 1 출력, 존재하지 않으면 0 출력
            if (hm.containsKey(arr2[j])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
