package 약수구하기_2501번;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 정수 N 입력
        int K = sc.nextInt(); // 정수 N의 K번째로 작은 정수 입력
        int count = 0; // 약수의 개수를 저장하는 변수
        int result = 1; // 약수의 순서를 저장하는 변수

        while(count < K){ // K번째로 작은 약수가 나올 때까지 반복
            if(N % result == 0) count++; // N의 약수인 경우 약수의 개수인 count를 증가시킨다

            // 정수 N보다 많이 반복문을 돌았는데도 약수의 개수(count)가 K보다 작다면
            // N의 약수는 K개 보다 적으므로 약수가 존재하지 않는다.
            if(result>N){ // 만약 N의 약수가 K개 보다 적을 경우 == K번째 약수 존재하지X
                System.out.println(0);
                return;
            }
            result++; // 한바퀴 돌때마다 약수의 순서인 result를 증가시킨다
        }
        System.out.println(--result);
    }
}