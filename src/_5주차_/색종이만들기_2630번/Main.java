package _5주차_.색종이만들기_2630번;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        String[][] candy = new String[n][n];

        // 2차원 배열에 사탕 색상 삽입
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine(), "");
                candy [i][j] = st.nextToken();
            }

        



    }
}
