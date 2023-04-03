package _2주차_.수정렬하기3_10989번;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 몇번 입력받을지 설정
        int[] num = new int[n];
        int[] counting = new int[10001];
        int[] result = new int[n];

        for (int m = 0; m < n; m++) {
            num[m] = Integer.parseInt(br.readLine());
        }

        // 카운팅정렬(더 빠름)
        // https://st-lab.tistory.com/104

        // 과정 1
        for (int i = 0; i < num.length; i++) {
            // array 의 value 값을 index 로 하는 counting 배열 값 1 증가
            counting[num[i]]++;
        }

        // 과정 2
        for (int i = 1; i < counting.length; i++) {
            // 누적 합 해주기
            counting[i] += counting[i - 1];
        }

        // 과정 3
        for (int i = num.length - 1; i >= 0; i--) {
            /*
             *  i 번쨰 원소를 인덱스로 하는 counting 배열을 1 감소시킨 뒤
             *  counting 배열의 값을 인덱스로 하여 result에 value 값을 저장한다.
             */
            int value = num[i];
            counting[value]--;
            result[counting[value]] = value;
        }
        for (int m = 0; m < n; m++) {
            bw.write(Integer.toString(result[m]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}

        // sort() 메소드 사용(퀵정렬)
        // sort() 메소드는 알아서 빠른 걸로 돌려주는데 여기선 퀵정렬로 돌림
//        for (int m = 0; m < n; m++) {
//            num[m] = Integer.parseInt(br.readLine()); // 입력 받아서 int형으로 변환
//        }
//        Arrays.sort(num); // 배열 정렬

//        // 배열 순서대로 출력
//        for (int m = 0; m < n; m++) {
//            bw.write(Integer.toString(num[m]));
//            bw.newLine(); // 들여쓰기
//        }
//        bw.flush();
//        bw.close();
//    }
//}