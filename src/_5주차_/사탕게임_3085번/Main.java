package _5주차_.사탕게임_3085번;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static char[][] candy;
    public static int maxcandy = 0;
    public static int n = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        candy = new char[n][n];

        // 2차원 배열에 사탕 색상 삽입
        for (int i = 0; i < n; i++) {
            String st = br.readLine();
            for (int j = 0; j < n; j++) {
                candy[i][j] = st.charAt(j);
            }
        }

        /*
        좌우(위아래)를 바꾸고
        모든 행의 좌우를 비교해서 같으면 cnt++ 끝까지 반복
                              다르면 cnt=1 (연속이 끊기니깐)
        모든 열의 위아래를 비교해서 같으면 cnt+1 끝까지 반복
                               다르면 cnt=1 (연속이 끊기니깐)
        강자 큰 수를 저장

        위의 작업을 반복해서 가장 큰 수가 먹을 수 있는 사탕의 최대 개수
         */

        // 한 행의 같은 열의 개수 확인
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n-1; j++) {
                // 양 옆의 값을 바꿈
                char temp = candy[i][j];
                candy[i][j] = candy[i][j+1];
                candy[i][j+1] = temp;
                //swap(candy[i][j], candy[i][j+1]);
                check(); // 해당 행에 같은 사탕의 수 구하기
                // 교환한 문자 제자리로 복구
                temp = candy[i][j];
                candy[i][j] = candy[i][j+1];
                candy[i][j+1] = temp;

            }
        // 한 열의 같은 행의 개수 확인
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n-1; j++) {
                char temp = candy[j][i];
                candy[j][i] = candy[j+1][i];
                candy[j+1][i] = temp;
                // swap(candy[j][i], candy[j][i+1]);
                check(); // 해당 열에 같은 사탕의 수 구하기
                // 교환한 문자 제자리로 복구
                temp = candy[j][i];
                candy[j][i] = candy[j+1][i];
                candy[j+1][i] = temp;

            }

        System.out.println(maxcandy);
    }
    public static void check() {
        // 행 체크
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n-1; j++) {
                if (candy[i][j] == candy[i][j+1])
                    cnt++;
                else // 연속이 끊어졌으니깐 1부터 다시 시작
                    cnt = 1;
                if (cnt == n) { // 한 줄 전체가 같다면 최대값이므로
                    maxcandy = cnt;
                    return; // 더 찾을 필요 없어 함수 탈출
                }
                // 두 매개변수 중 큰 값을 리턴
                // 각 행에서 나온 cnt와 지금까지 행에서 나온 최대값인 maxcandy를 비교해서 저장
                maxcandy = Math.max(cnt, maxcandy);
            }
        }
        // 열 체크
        for (int j = 0; j < n; j++) {
            int cnt = 1;
            for (int i = 0; i < n-1; i++) {
                if (candy[i][j] == candy[i+1][j])
                    cnt++;
                else // 연속이 끊어짐 -> 1부터 다시 시작
                    cnt = 1;
                if (cnt == n) { // 한 줄 전체가 같다면 최대값이므로
                    maxcandy = cnt;
                    return; // 더 찾을 필요 없어 함수 탈출
                }
                // 두 매개변수 중 큰 값을 리턴
                maxcandy = Math.max(cnt, maxcandy);
            }
        }
    }
}