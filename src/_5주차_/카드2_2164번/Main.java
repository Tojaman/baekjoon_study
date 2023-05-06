package _5주차_.카드2_2164번;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        // 1~n까지 값을 큐에 저장
        // IntStream.rangeClosed(1, n) : 1~n까지 숫자를 스트림으로 생성
        // forEach() : 큐에 한번에 데이터를 추가
        // IntStream.rangeClosed(1, n).forEach(queue::offer); // 큰 데이터셋에 유리함, 간결함
        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            queue.remove(); // 맨 위에 값 제거
            queue.offer(queue.poll()); // 바로 다음 값을 맨 뒤로 옮김
        }
        System.out.println(queue.poll());
    }
}