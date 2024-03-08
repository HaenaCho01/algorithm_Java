package DoItAlgorithmIntroduction.chap01.part2repetition;

// 1~n 의 합과 그 값을 구하는 과정을 출력(2)

import java.util.Scanner;

public class SumVerbose2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do {
            System.out.println("n값: ");
            n = sc.nextInt();
        } while (n <= 0);

        int sum = 0;        // 합

        for (int i = 1; i < n; i++) {
            System.out.print(i + " + ");
            sum += i;
        }

        System.out.print(n + " = ");
        sum += n;
        System.out.println(sum);
    }
}
