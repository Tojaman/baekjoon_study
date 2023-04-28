package _4주차_.그룹단어체커_1316번;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st ;


        int n = Integer.parseInt(br.readLine()); // 입력 받을 단어의 수
        int gword = 0;
        // 문자열을 입력 받아서 input 배열에 한 단어씩 삽입
        st = new StringTokenizer(br.readLine(), "\n");
        for(int i = 0; i < n; i++)
            // 만약 그룹 단어라면 gword++
            if(check(st.nextToken()) == true) {
                gword++;
            }
        bw.write(gword);
        bw.flush();
        bw.close();
    }

    // 방법1 : 각 자리의 값들을 비교해서 값이 다르면 넘어가고 같으면 배열에 저장한다.
    // 배열을 정렬한다.
    // 배열의 앞과 뒤를 비교하며 같은 게 있다면 false 없다면 true 출력
    static boolean check(String word){

    }
}