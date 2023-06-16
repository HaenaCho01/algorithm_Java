package Programmers.lv0.codingTestBasicsTraining.day2_출력_연산;

import java.util.Scanner;

public class Sol1_덧셈식_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
    }
}

/*
테스트 1 〉	통과 (133.77ms, 66.1MB)
테스트 2 〉	통과 (150.01ms, 71.1MB)
테스트 3 〉	통과 (168.12ms, 69.9MB)
 */