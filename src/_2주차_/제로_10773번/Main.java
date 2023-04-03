package _2주차_.제로_10773번;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 몇번 입력받을지 설정
        Stack<Integer> stack = new Stack<>(); // 스택 객체 생성

        // n번
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num != 0) stack.push(num); // 0이 아닐 경우 스택에 적재
            else stack.pop(); // 0일 경우 가장 최근 수 삭제
        }

        // 스택의 합 구하기
        int sum = 0;
        // 스택이 비어 있을 때까지 요소들을 더해서 합 구하기
        while (!stack.empty()) {
            sum += stack.pop();
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}