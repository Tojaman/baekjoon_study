package _1주차_.지능형기차_2460번;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] train = new int[10]; // 10개의 역을 배열로 설정
        int in, out; // 각 역에서 타는 사람 수와 내리는 사람 수

        for (int i = 0; i < 10; i++) { // 10개의 역을 거치니깐 10번 반복
            out = sc.nextInt(); // 내리는 사람 수
            in = sc.nextInt(); // 타는 사람 수
            if (i == 0) // 첫번째 역
                train[i] = in; // 타기만 함
            else
                // 이전 역 기차에 타 있던 사람 수 + 이번 기차에 탄 사람 수 - 내린 사람 수
                train[i] = train[i-1] + in - out;
        }
        Arrays.sort(train); // 내림차순 배열
        System.out.println(train[9]); // 최댓값 출력
    }
}