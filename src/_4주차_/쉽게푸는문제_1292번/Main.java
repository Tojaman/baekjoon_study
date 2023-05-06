package _4주차_.쉽게푸는문제_1292번;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        // Scanner sc = new Scanner(System.in);


        int n1, n2;
        st = new StringTokenizer(br.readLine(), " ");
        n1 = Integer.parseInt(st.nextToken());
        n2 = Integer.parseInt(st.nextToken());

//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();

        int cnt = 0;
        int sum = 0;
        for(int i = 1; i <= n2; i++) {
            for (int j = 0; j < i; j++) {
                ++cnt;
                if(cnt >= n1 && cnt <= n2) sum += i;
            }
        }
        // 두가지 출력 방식 속도 차이X
        System.out.print(sum);
//        bw.write(String.valueOf(sum));
//        bw.flush();
//        bw.close();
    }
}