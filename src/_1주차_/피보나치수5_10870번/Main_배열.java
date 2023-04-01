package _1주차_.피보나치수5_10870번;
import java.util.Scanner;

// 배열을 이용한 풀이
public class Main_배열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt(); // 피보나치 수 입력

        int[] fn = new int[cnt+1]; // 수열을 저장하기 위한 배열

        for (int i = 0; i < cnt + 1; i++) {
            if(i==0) fn[i] = 0; // 첫번째 수열 0
            else if (i == 1) fn[i] = 1; // 두번째 수열 1
            else fn[i] = fn[i-1] + fn[i-2]; // 그 외는 앞의 두 항을 합친 값
        }
        System.out.println(fn[cnt]); // cnt번째 피보나치 수 출력
    }
}