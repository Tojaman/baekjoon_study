package 최소최대_10818번;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num); // Arrays.sort(배열) : 배열을 크기 순으로 정렬해주는 메소드
                          // import java.util.Arrays; 해줘야함
        System.out.print(num[0] + " " + num[N-1]);
    }
}