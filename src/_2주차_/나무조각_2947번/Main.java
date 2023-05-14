package _2주차_.나무조각_2947번;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] wood = new int[5];
        // 입력받은 문자열을 구분자(기본:공백)로 분리하여 int형 배열에 입력
        for(int i = 0; i < wood.length; i++) {
            wood[i] = Integer.parseInt(st.nextToken());
        }

        // 버블정렬 알고리즘
        // 앞 요소와 뒤 요소를 비교하여 앞 요소가 더 크다면 자리변경
        // 한바퀴 돌면 가장 큰 요소는 맨 뒤에 가게 되므로
        for (int i = 0; i < wood.length; i++) {
            for (int j = 1; j < wood.length -i; j++) {
                if (wood[j-1] > wood[j]) {
                    int temp = wood[j-1];
                    wood[j-1] = wood[j];
                    wood[j] = temp;
                    for (int n = 0; n < wood.length; n++) System.out.printf("%d ", wood[n]);
                    System.out.println("");
                }
            }
        }
    }
}

//        boolean isSorted = false;
//        while (isSorted == false) {
//            for (int i = 1; i < wood.length; i++) {
//                if (wood[i - 1] > wood[i]) {
//                    int tmp = wood[i - 1];
//                    wood[i - 1] = wood[i];
//                    wood[i] = tmp;
//                    for (int j = 0; j < wood.length; j++) System.out.printf("%d ", wood[j]);
//                    System.out.println("");
//                }
//            }
//            for (int i = 0; i < wood.length; i++) {
//                if (wood[i] != i + 1) break;
//                else isSorted = true;
//            }
//        }