package Programmers.lv0.codingTestIntroduction.day6_문자열_반복문_출력_배열_조건문;

import java.util.Scanner;

public class Sol2_직각삼각형_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
테스트 1 〉	통과 (148.78ms, 63.4MB)
테스트 2 〉	통과 (165.19ms, 68MB)
테스트 3 〉	통과 (156.13ms, 69.4MB)
테스트 4 〉	통과 (152.15ms, 68.5MB)
테스트 5 〉	통과 (187.85ms, 71.6MB)
테스트 6 〉	통과 (161.60ms, 68MB)
테스트 7 〉	통과 (155.81ms, 72.4MB)
테스트 8 〉	통과 (152.78ms, 68.7MB)
테스트 9 〉	통과 (164.70ms, 68.2MB)
테스트 10 〉	통과 (171.60ms, 66.9MB)
 */
