package _5주차_.색종이만들기_2630번;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    // 반으로 쪼개고
    // 쪼갠 걸 검사하고
    // 만약 조건에 부합한다면 -> 중단
    // 만약 조건에 부합하지 않는다면 -> 재귀
    public static int white = 0;
    public static int blue = 0;
    public static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        arr = new int[n][n];

        // 2차원 배열에 색종이 입력
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // col 시작, row 시작, 크기
        partition(0, 0, n);

        System.out.println(white);
        System.out.println(blue);
    }

    public static void partition(int row, int col, int size) {

        // 파티션에 서로 다른 색상이 있으면 false
        // 파티션에 모두 같은 색상만 있다면 ture를 리턴받고 아래 if문 실헹
        if(colorCheck(row, col, size)) {
            if(arr[row][col] == 0) { // 하얀색
                white++;
            }
            else { // 파란색
                blue++;
            }
            return; // 한 파티션이 모두 같은 색이라면 그 파티션은 종료
        }

        // 한 파티션에 서로 다른 색깔이 있는 경우
        // 4조각으로 나눈다.
        int newSize = size / 2;	// 절반 사이즈
        // 위에서 종료되지 않았다면 다른 색이 있다는 거니깐 4개로 쪼깨기 재귀 반복
        partition(row, col, newSize); // 2사분면
        partition(row, col + newSize, newSize); // 1사분면
        partition(row + newSize, col, newSize); // 3사분면
        partition(row + newSize, col + newSize, newSize); // 4사분면
    }


    // 현재 파티션의 컬러가 같은지 체크한다.
    public static boolean colorCheck(int row, int col, int size) {

        int color = arr[row][col];	// 첫 번째 원소를 기준으로 검사

        // 한 partition 전체 반복
        for(int i = row; i < row + size; i++) {
            for(int j = col; j < col + size; j++) {
                // 하나라도 색상이 같이 않다면 false를 리턴
                if(arr[i][j] != color) {
                    return false;
                }
            }
        }
        // 검사가 모두 통과했다는 의미이므로 true 리턴
        return true;
    }
}