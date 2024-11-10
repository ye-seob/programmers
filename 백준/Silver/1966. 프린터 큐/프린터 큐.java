import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 수

        for (int t = 0; t < T; t++) { // 각 테스트 케이스 반복
            int N = sc.nextInt(); // 문서의 개수
            int M = sc.nextInt(); // 찾고자 하는 문서의 인덱스

            LinkedList<int[]> q = new LinkedList<>();

            for (int i = 0; i < N; i++) {
                q.offer(new int[] {i, sc.nextInt()}); // 문서의 인덱스와 중요도 저장
            }

            int count = 0;

            while (!q.isEmpty()) {
                int[] front = q.poll(); // 큐에서 첫 번째 문서 꺼냄
                boolean isMax = true; // front 문서가 가장 중요한지 체크

                // 큐에 있는 다른 문서들과 중요도를 비교
                for (int i = 0; i < q.size(); i++) {
                    if (front[1] < q.get(i)[1]) { // 큐에 있는 문서의 중요도가 더 높으면
                        q.offer(front); // front 문서를 뒤로 보냄
                        for (int j = 0; j < i; j++) {
                            q.offer(q.poll()); // 현재 순서까지 뒤로 보냄
                        }
                        isMax = false; // front가 가장 중요한 문서가 아님
                        break;
                    }
                }

                if (!isMax) {
                    continue; // 가장 중요한 문서가 아니면 다시 큐의 끝으로 이동
                }

                // front 문서가 가장 중요하다면
                count++; // 출력되는 문서 개수 증가
                if (front[0] == M) { // 찾고자 하는 문서가 front 문서라면
                    System.out.println(count); // 몇 번째로 출력되는지 출력
                    break; // 해당 테스트케이스 종료
                }
            }
        }

        sc.close(); // 스캐너 닫기
    }
}
