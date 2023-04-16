package _3주차_.소트인사이드_1427번;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine(); // String 타입으로 값 입력 받음
        int count = str.length(); // 값의 길이
        Integer[] num = new Integer[count]; // 입력받을 값을 저장할 Integer 배열
                                            // 내림차순에서 사용할 Collections.reverseOrder()가
                                            // int형 배열엔 사용이 불가능해서 Integer 배열 사용

        for (int i = 0; i < count; i++) {
            num[i] = str.charAt(i) - '0'; // 각 자릿수를 char형을 변환하고 아스키코드값을 이용해 다시 int형으로 변환해서 num배열에 넣기
        }
        Arrays.sort(num, Collections.reverseOrder()); // 내림차순 정렬

        for (int j = 0; j < count; j++) {
            bw.write(Integer.toString(num[j]));
        }

        bw.flush();
        bw.close();
    }
}