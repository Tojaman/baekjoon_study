package _5주차_.동전0_11047번;

import java.io.*;
import java.util.StringTokenizer;

public class Main_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0; // 필요한 동전 개수
        /*
        동전의 가치가 k보다 작다면 "k - 동전" & cnt++
        만약 k == 0이 된다면 종료
         */
        for (int j = n-1; j >= 0; j--) {
            while (k - arr[j] >= 0) {
                k -= arr[j];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}