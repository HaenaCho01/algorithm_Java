package DoItAlgorithmIntroduction.chap01.part2repetition;

// a~b 까지의 합을 구함

import java.util.Scanner;

public class Practice08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a부터 b까지의 합을 구합니다.");
        System.out.println("a값: ");
        int a = sc.nextInt();
        System.out.println("b값: ");
        int b = sc.nextInt();

        int sum = 0;

        for (int i = Math.min(a, b); i <= Math.max(a, b);  i++) {
            sum += i;
        }

        System.out.println(a + "부터 " + b + "까지의 합은 " + sum + "입니다.");
    }
}
