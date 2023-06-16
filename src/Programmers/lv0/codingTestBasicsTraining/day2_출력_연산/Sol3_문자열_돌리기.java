package Programmers.lv0.codingTestBasicsTraining.day2_출력_연산;

import java.util.Scanner;

public class Sol3_문자열_돌리기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }
    }
}

/*
테스트 1 〉	통과 (134.06ms, 67.2MB)
테스트 2 〉	통과 (132.19ms, 69.1MB)
테스트 3 〉	통과 (127.82ms, 63.5MB)
 */
