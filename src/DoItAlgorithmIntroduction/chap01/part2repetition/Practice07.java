package DoItAlgorithmIntroduction.chap01.part2repetition;

// '가우스의 덧셈'을 이용한 1부터 n 까지의 정수 합을 구하는 프로그램 작성하기

import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n값: ");
        int n = sc.nextInt();

        int sum = (1 + n) * n / 2;

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
