package DoItAlgorithmIntroduction.chap01.part2repetition;

// while 문으로 1~n까지의 합을 구함

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n값: ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        // while 문: while(제어식) 명령문
        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
