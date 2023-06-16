package Baekjoon.lv1_Bronze.lv0_grade5;

import java.util.Scanner;

public class B_15964_이상한_기호 {
    public static void main(String[] args) {
        B_15964_이상한_기호 cal = new B_15964_이상한_기호();
        // 첫째 줄에 A, B가 주어짐
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt(); // 조건에 따른 int or long 잘 확인하기!
        long b = sc.nextInt();
        sc.close();

        // 출력 A @ B = (A+B)*(A-B)
        System.out.println((a + b) * (a - b));
    }
}
