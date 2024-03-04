package Baekjoon.lv1_Bronze.lv3_grade2;

import java.util.Scanner;

public class B_1978_소수_찾기 {
    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            answer += checkPrimeNum(a);
        }
        sc.close();
        System.out.println(answer);
    }

    private static int checkPrimeNum(int num) {
        if (num == 1) return 0;
        if (num == 2) return 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return 0;
        }
        return 1;
    }
}
