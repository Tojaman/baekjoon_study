package _1주차_.피보나치수5_10870번;

// 재귀를 이용한 풀이
import java.util.Scanner;

public class Main_재귀 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt(); // 피보나치 수 입력
        System.out.println(fibonacci(cnt)); // 피보나치 수열 함수 출력
    }
    static int fibonacci(int n)
    {
        if (n==0) return 0; // 첫번째 수
        if (n==1) return 1; // 두번째 수
        // 0이나 1이 아닌 경우 재귀 호출
        else return fibonacci(n-1) + fibonacci(n-2);
    }
}