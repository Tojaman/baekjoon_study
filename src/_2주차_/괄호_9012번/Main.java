package _2주차_.괄호_9012번;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 몇번 입력받을지 설정

        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();
            char[] stack = new char[tmp.length()]; // 스택 생성
            int sp = -1; // 스택 포인트
            int m = 0; // ( : ++, ) : --

            // 입력받은 String 값을 char 로 변환해서 배열에 저장
            for (int j = 0; j < tmp.length(); j++) {
                sp++;
                stack[j] = tmp.charAt(j);
            }

            for (int k = 0; k < stack.length; k++) {
                if (stack[k] == '(') m++;
                else m--;
                if (m == -1) { // '('가 항상 먼저 와야하므로 ')'가 먼저 오는 경우 반복문 탈출해서 NO 출력
                    break;
                }
            }
            if (m == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}