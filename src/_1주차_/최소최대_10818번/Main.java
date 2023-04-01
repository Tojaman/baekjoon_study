package _1주차_.최소최대_10818번;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // N에 정수의 개수를 입력
        int[] num = new int[N]; // N개의 정수를 입력받을 배열 선언
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt(); // 배열에 정수 입력 받음
        }
        Arrays.sort(num); // Arrays.sort(배열) : 배열을 크기 순으로 정렬해주는 메소드
                          // import java.util.Arrays; 해줘야함
        System.out.print(num[0] + " " + num[N-1]); // num[0] == 최솟값 / num[N-1] == 최댓값
    }
}