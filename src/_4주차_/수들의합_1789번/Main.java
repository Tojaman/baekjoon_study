package _4주차_.수들의합_1789번;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 서로 다른 n개의 자연수의 합
        long s = Long.parseLong(br.readLine());
        long sum = 0;
        int i = 0;

        while (true) {
            if(sum > s) break;
            sum += ++i;
        }
        System.out.println(--i);
    }
}