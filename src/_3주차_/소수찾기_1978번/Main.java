package _3주차_.소수찾기_1978번;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine()); // 입력 받을 개수를 입력
        st = new StringTokenizer(br.readLine()); // 수 입력
        int measure = 0; // 약수의 개수
        int decimal_num = 0; // 소수의 개수


        for (int j = 0; j < N; j++) {
            int num = Integer.parseInt(st.nextToken()); // 입력받은 수 쪼개기
            measure = 0; // 매 숫자마다 약수의 개수 0으로 초기화
            for (int i = 1; i <= num; i++) // 1~자기 자신까지 나누기
                if (num % i == 0) measure++; // 약수이면 measure++
            if (measure == 2) decimal_num++; // 약수의 개수가 2개이면(소수이면) decimal_num++
        }
        bw.write(Integer.toString(decimal_num));
        bw.flush();
        bw.close();
    }
}
//    static int decimal(int[] arr, int n){
//        int measure = 0; // 약수의 개수
//        int decimal_num = 0; // 소수의 개수
//        for (int k = 0; k < n; k++) { // 배열의 개수만큼 반복
//            measure = 0;
//            for (int m = 1; m <=arr[k]; m++) { // 1~자기자신까지 나누기 실행
//                if (arr[k] % m == 0) measure++; // 약수이면 measure++
//            }
//            if (measure == 2) decimal_num++; // measure가 2개이면(소수이면) decimal_num++
//        }
//        return decimal_num;
//    }
//}