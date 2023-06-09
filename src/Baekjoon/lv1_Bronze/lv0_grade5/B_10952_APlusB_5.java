package Baekjoon.lv1_Bronze.lv0_grade5;

import java.util.ArrayList;
import java.util.Scanner;

public class B_10952_APlusB_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> values = new ArrayList<>();
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;
            } else {
                values.add(a + b);
            }
        }
        sc.close();

        for (Integer value: values) {
            System.out.println(value);
        }
    }
}
