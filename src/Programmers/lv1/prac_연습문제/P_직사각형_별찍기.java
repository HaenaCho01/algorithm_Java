package Programmers.lv1.prac_연습문제;

import java.util.Scanner;

public class P_직사각형_별찍기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= a; i++) {
            sb.append('*');
        }
        for (int i = 1; i <= b; i++) {
            System.out.println(sb);
        }
    }
}

/*
테스트 1 〉	통과 (141.43ms, 61.9MB)
테스트 2 〉	통과 (144.88ms, 63.2MB)
테스트 3 〉	통과 (181.05ms, 75.6MB)
테스트 4 〉	통과 (133.39ms, 66.5MB)
테스트 5 〉	통과 (169.67ms, 67.9MB)
테스트 6 〉	통과 (154.48ms, 68.2MB)
테스트 7 〉	통과 (142.63ms, 69.8MB)
테스트 8 〉	통과 (157.41ms, 64.4MB)
테스트 9 〉	통과 (144.42ms, 66.4MB)
테스트 10 〉	통과 (161.28ms, 64.5MB)
테스트 11 〉	통과 (144.92ms, 69.6MB)
 */