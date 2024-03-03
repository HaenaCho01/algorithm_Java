package Baekjoon.lv1_Bronze.lv2_grade3;

import java.util.Scanner;

public class B_직각삼각형 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0 || b == 0 || c == 0) break;

            int x = a * a; int y = b * b; int z = c * c;
            if (x + y == z) System.out.println("right");
            else if (y + z == x) System.out.println("right");
            else if (x + z == y) System.out.println("right");
            else System.out.println("wrong");
        }
        sc.close();
    }
}
