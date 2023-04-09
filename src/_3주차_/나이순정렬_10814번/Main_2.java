package _3주차_.나이순정렬_10814번;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_2 {
    public static void main(String[] args) throws IOException {
        // 나이, 이름 가입 순서대로 주어짐
        // 나이 오름차순(같다면 가입 순서로) 정렬

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine()); // 회원 수

        String[][] people = new String[N][2];

        for (int i = 0; i < N; i++) {
            String tmp = br.readLine();
            st = new StringTokenizer(tmp, " ");
            people[i][0] = st.nextToken(); // 이름 입력
            people[i][1] = st.nextToken(); // 나이 입력
        }
        // 1열을 기준으로 오름차순으로 정렬하는 Comparator 구현
        Comparator<String[]> comp = new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                return Integer.compare(Integer.parseInt(s1[0]), Integer.parseInt(s2[0])); // 1열 기준으로 비교
            }
        };

        Arrays.sort(people, comp); // 2차원 배열 정렬

        for (int i = 0; i < N; i++) {
            bw.write(people[i][0] + " " + people[i][1]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}