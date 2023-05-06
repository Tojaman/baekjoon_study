package _4주차_.그룹단어체커_1316번;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


        int n = Integer.parseInt(br.readLine()); // 입력 받을 단어의 수
        int gword = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), "\n");
            String word = st.nextToken();
            // 만약 그룹 단어라면 gword++
            if (check(word) == true) gword++;
        }
        bw.write(String.valueOf(gword));
        bw.flush();
        bw.close();
    }

    static boolean check(String word) {
        char[] ch = word.toCharArray();
        ArrayList<Character> tmp = new ArrayList<Character>();
        tmp.add(ch[0]);
        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] != ch[i + 1]) tmp.add(ch[i + 1]);
        }
        tmp.sort(null);
        for (int j = 0; j < tmp.size() - 1; j++) {
            if (tmp.get(j) == tmp.get(j + 1)) return false;
        }
        return true;
    }
}