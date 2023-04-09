package _3주차_.큐_10845번;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Queue queue = new Queue(n);

        for (int i = 0; i < n; i++) {
            // StringTokenizer를 이용하여 문자열 분리
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            switch (st.nextToken()) {
                case "push":
                    queue.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    queue.pop();
                    break;
                case "front":
                    queue.front();
                    break;
                case "back":
                    queue.back();
                    break;
                case "size":
                    queue.size();
                    break;
                case "empty":
                    queue.empty();
                    break;
            }
        }
    }
}
class Queue {
    int [] queue;
    int front, rear;
    Queue(int n) {
        this.queue = new int[n];
        this.front = -1;
        this.rear = -1;
    }
    void push(int num) {
        queue[++rear] = num;
    }
    void pop() {
        if (front == rear) System.out.println(-1);
        else System.out.println(queue[++front]);
    }
    void size() {
        System.out.println(rear-front);
    }
    void empty() {
        // 비어 있으면 1, 차 있으면 0
        if (rear == front) System.out.println(1);
        else System.out.println(0);
    }
    void front() {
        if (front == rear) System.out.println(-1);
        else System.out.println(queue[front + 1]);
    }
    void back() {
        if (front == rear) System.out.println(-1);
        else System.out.println(queue[rear]);
    }
}