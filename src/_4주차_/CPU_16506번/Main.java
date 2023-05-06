package _4주차_.CPU_16506번;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        HashMap<String, String> map = new HashMap<String, String>(); // opcode를 저장할 공간
        map.put("ADD", "00000");map.put("ADDC", "00001");
        map.put("SUB", "00010");map.put("SUBC", "00011");
        map.put("MOV", "00100");map.put("MOVC", "00101");
        map.put("AND", "00110");map.put("ANDC", "00111");
        map.put("OR", "01000");map.put("ORC", "01001");
        map.put("NOT", "01010");
        map.put("MULT", "01100");map.put("MULTC", "01101");
        map.put("LSFTL", "01110");map.put("LSFTLC", "01111");
        map.put("LSFTR", "10000");map.put("LSFTRC", "10001");
        map.put("ASFTR", "10010");map.put("ASFTRC", "10011");
        map.put("RL", "10100");map.put("RLC", "10101");
        map.put("RR", "10110");map.put("RRC", "10111");

        String [] opB = {"ADD","SUB","MOV","AND","OR","NOT","MULT","LSFTL","LSFTR","ASFTR","RL","RR"};
        String [] opC = {"ADDC","SUBC","MOVC","ANDC","ORC","MULTC","LSFTLC","ASFTRC","RLC","RRC"};

        int n = Integer.parseInt(br.readLine()); // 입력받을 명령어의 개수

        char[][] binary = new char[n][16];
        String opcodenum = "";
        // opcode와 레지스터 입력 받기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String opcode = st.nextToken();
            int rD = Integer.parseInt(st.nextToken());
            int rA = Integer.parseInt(st.nextToken());
            int rB_C = Integer.parseInt(st.nextToken());

            binary[i][5] = '0';
            // opcode 해시맵에서 찾은 후 2진수를 char형으로 변환하여 binary에 배열에 삽입
            String tmp = map.get(opcode);
            for (int j = 0; j < 5; j++) {
                binary[i][j] = tmp.charAt(j);
            }

            // rD binary 삽입
            String rD_st = String.format("%3s", Integer.toBinaryString(rD)).replace(' ', '0');
            for (int j = 6; j < 9; j++) {
                binary[i][j] = rD_st.charAt(j-6);
            }

            // rA binary 삽입
            String rA_st = String.format("%3s", Integer.toBinaryString(rA)).replace(' ', '0');
            for (int j = 9; j < 12; j++) {
                binary[i][j] = rA_st.charAt(j-9);
            }

            // rB or #C binary 삽입

            // rB인 경우
            if(binary[i][4] == '0') {
                String BC = String.format("%3s", Integer.toBinaryString(rB_C)).replace(' ', '0');
                for (int j = 12; j < 15; j++) {
                    binary[i][j] = BC.charAt(j-12);
                }
                binary[i][15] = '0';
            }
            // #C인 경우
            if(binary[i][4] == '1') {
                String BC = String.format("%4s", Integer.toBinaryString(rB_C)).replace(' ', '0');
                for (int j = 12; j < 16; j++) {
                    binary[i][j] = BC.charAt(j-12);
                }
            }
        }
        for(int k = 0; k < n; k++) {
            for (int j = 0; j < 16; j++)
                System.out.print(binary[k][j]);
            System.out.println();
        }
    }
}