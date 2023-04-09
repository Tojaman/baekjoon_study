package _3주차_.나이순정렬_10814번;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        // 나이, 이름 가입 순서대로 주어짐
        // 나이 오름차순(같다면 가입 순서로) 정렬

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine()); // 회원 수

        // list의 타입을 Person 객체로 두고 Person 객체 안에 age와 name을 변수로 둔다.
        // list에 Person 객체를 넣는다.
        ArrayList<Person> people = new ArrayList<Person>();
        for (int i = 0; i < N; i++) {
            String tmp = br.readLine();
            st = new StringTokenizer(tmp, " ");
            people.add(new Person(Integer.parseInt(st.nextToken()), st.nextToken()));
        }
        // people list 객체를 정렬한다.
        // Collection 인터페이스를 구현한 객체에 대한 정렬 수행 메소드
        Collections.sort(people);

        for (Person p : people) {
            bw.write(p.getAge() + " " + p.getName());
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}

class Person implements Comparable<Person> {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age); // 나이를 기준으로 정렬
    }
}