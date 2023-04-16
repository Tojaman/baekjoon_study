package _3주차_.요세푸스문제0_11866번;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        // int[] arr = new int[N]; // 제거된 값을 저장할 배열
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for (int i = 1; i <= N; i++) queue.add(i); // 큐에 1~7 값 삽입

        int n = 0;
        // 큐가 빌 때까지 반복
        while (n < N - 1) {
            for (int j = 1; j < K; j++) queue.add(queue.poll()); // 앞의 두 값을 삭제하고 큐의 뒤에 다시 삽입
            // arr[n++] = queue.poll(); // 큐의 3번째 값을 arr에 넣고 삭제
            sb.append(queue.poll()).append(", ");
            n++;
        }
        sb.append(queue.poll()).append(">");
        System.out.println(sb);
    }
}
//         System.out.print("<");
//         for (int b = 0; b < N-1; b++) System.out.print(arr[b] + ", ");
//        System.out.print(arr[6]);
//         System.out.print(">");
