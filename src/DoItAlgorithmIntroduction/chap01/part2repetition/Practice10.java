package DoItAlgorithmIntroduction.chap01.part2repetition;

// 양의 정수를 입력하고 자릿수를 출력하는 프로그램 작성

import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("n의 자릿수를 구합니다.");

        do {
            System.out.println("n값: ");
            n = sc.nextInt();
            if (n <= 0) System.out.println("양의 정수를 입력하세요!");
        } while (n <= 0);

        int answer = Integer.toString(n).length();
        System.out.println("그 수는 " + answer + "자리입니다.");
    }
}
