import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

class Main{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()); // 난이도 개수
        int[] level = new int[n]; // 난이도 배열
        
       
        
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            level[i] = Integer.parseInt(input);
        }
        
        Arrays.sort(level); // 오름차순 정렬
        
        int num = (int) Math.round(n * 0.15); // 상위 15%, 하위 15% 제거한 개수
        
        int sum = 0;
        int count = n - 2 * num; // 제거된 개수 만큼 제외
        
        if (count <= 0) {
            System.out.println(0);
        } else {
            // 상위 15%와 하위 15%를 제외한 난이도 합산
            for (int i = num; i < n - num; i++) {
                sum += level[i];
            }
            System.out.println(Math.round((double) sum / count)); // 평균 출력
        }
    }
}
