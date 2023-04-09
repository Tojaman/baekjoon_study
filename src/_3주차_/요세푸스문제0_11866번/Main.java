package _3주차_.요세푸스문제0_11866번;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] yosep = new int[N];
//        for (int j = 0; j < N; j++) {
//            yosep[j] = intList.get(K-1);
//            intList.remove(K-1);
//        }

        System.out.printf("<");
        for (int k = 0; k < 0; k++) System.out.println(yosep[k]);
        System.out.printf(">");
    }
}

class circle_linklist {
    int data;

}