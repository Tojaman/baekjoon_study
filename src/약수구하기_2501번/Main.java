package 약수구하기_2501번;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0; // 약수의 개수를 저장하는 변수
        int result = 1; // 약수의 순서를 저장하는 변수

        while(count < K){ // K번째로 작은 약수가 나올 때까지 반복
            if(N % result == 0) count++; // N의 약수인 경우
            if(result>N){ // 만약 N의 약수가 K개 보다 적을 경우 == K번째 약수 존재하지X
                System.out.println(0);
                return;
            }
            result++;
        }
        System.out.println(--result);
    }
}