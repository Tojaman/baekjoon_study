package _1주차_.이진수_3460번;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 개수를 잘못 이해해서 한참을 햇갈렸다.
        // 몇번 입력받아서 테스트할지를 말하는 거다.
        int T = sc.nextInt(); // 테스트 케이스 개수
        for (int i = 0; i < T; i++) { // T번 반복
            int n = sc.nextInt();
            String binary = Integer.toBinaryString(n); // 10진수를 2진수로 변환
            // n = Integer.parseInt(binary); // 원래는 다시 int형으로 변환해서 구하려고 했으나 이부분이 오류가 나서 char[] 배열로 구했다.
            char[] bn = binary.toCharArray(); // char형 배열에 저장
            int m = bn.length;
            // 문제에선 뒤에서 부터 시작( [...|3|2|1] )이라 했는데
            // 배열은 앞에서부터 시작( [0|1|2|3|...} )하기 때문에 아래처럼 설정
            for(int j = m - 1; j >= 0; j--){
                if (bn[j] == '1') System.out.print(m - j - 1 + " ");
            }
        }
    }
}
//        int n = sc.nextInt(); // 10진수 정수
//        String binary = Integer.toBinaryString(n); // 10진수를 2진수로 변환
//        n = Integer.parseInt(binary); // 2진수를 int형 변수로 변환
//
//        for(int i = 0; n > 0; i++){ // 2진수 n이 남아있을 떄까지 반복
//            if (n % 10 == 1) System.out.print(i + " "); // 만약 가장 앞자리가 1이라면 자릿수 출력
//            n = n / 10; // 가장 앞자리 삭제(모든 자릿수를 확인하면 n == 0이 된다)
//        }




//        int[] binary = new int[32]; // 2진수를 저장할 int형 배열
//        int index = 0;
//
//        while(n > 0){ // 10진수를 2진수로 바꾸는 함수
//            binary[index++] = n % 2;
//            n /= 2;
//        }
//        for(int i = 0; i < index; i++) {
//            if (binary[i] == 1) {
//                System.out.print(i + " ");
//            }
//        }