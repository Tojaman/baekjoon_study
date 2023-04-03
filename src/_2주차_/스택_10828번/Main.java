package _2주차_.스택_10828번;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());
        Stack stack = new Stack(n); // 스택 객체 생성


        for (int i = 0; i < n; i++) {
            // 문자열을 입력받고 공백을 기준으로 나눠서 배열에 저장(push를 위해)
            String[] input = br.readLine().split(" ");
            switch (input[0]) {
                case "pop":
                    stack.pop();
                    break;
                case "empty":
                    stack.empty();
                    break;
                case "top":
                    stack.top();
                    break;
                case "size":
                    stack.size();
                    break;
                case "push":
                    stack.push(Integer.parseInt(input[1]));
                    break;
            }

        }
    }
}

class Stack {
    static int[] stackarr; // 값을 저장할 배열 선언
    static int top; // 맨 위를 가르키는 스택 포인터

    // 생성자
    Stack(int n) {
        this.stackarr = new int[n]; // 스택 생성
        this.top = -1; // 초기 sp 설정
    }

    // 스택의 가장 위에 있는 정수를 빼고 출력
    void pop() {
        if (top == -1) System.out.println(top);
        else System.out.println(stackarr[top--]);
    }

    // 스택의 가장 위에 정수를 삽입
    void push(int num) {
        stackarr[++top] = num;
    }

    // 스택에 들어있는 정수의 개수
    void size() {
        System.out.println(top + 1);
    }

    // 스택이 비어 있다면 -> 0, 스택이 차 있다면 -> 1
    void empty() {
        if (top == -1) System.out.println(1);
        else System.out.println(0);
    }

    // 가장 위에 있는 정수 출력. 없을 경우 -1 출력
    void top() {
        if (top == -1) System.out.println(-1);
        else System.out.println(stackarr[top]);
    }
}