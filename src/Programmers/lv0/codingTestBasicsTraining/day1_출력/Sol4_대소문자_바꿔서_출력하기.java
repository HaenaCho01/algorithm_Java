package Programmers.lv0.codingTestBasicsTraining.day1_출력;

import java.util.Scanner;

public class Sol4_대소문자_바꿔서_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int charA = str.charAt(i);
            if (charA >=65 && charA <= 90) {
                sb.append((char) (charA+32));
            } else if (charA >=97 && charA <=122) {
                sb.append((char) (charA-32));
            }
        }
        System.out.println(sb);
    }
}

/*
테스트 1 〉	통과 (137.97ms, 61.7MB)
테스트 2 〉	통과 (139.59ms, 64.9MB)
테스트 3 〉	통과 (164.75ms, 69.6MB)
테스트 4 〉	통과 (162.01ms, 64MB)
 */
