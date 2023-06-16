package Programmers.lv0.codingTestBasicsTraining.day1_출력;

import java.util.Scanner;

public class Sol3_문자열_반복해서_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(str);
        }
    }
}

/*
테스트 1 〉	통과 (158.84ms, 67.1MB)
테스트 2 〉	통과 (147.74ms, 66.1MB)
테스트 3 〉	통과 (142.80ms, 63.9MB)
 */
