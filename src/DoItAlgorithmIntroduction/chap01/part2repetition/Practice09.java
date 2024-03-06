package DoItAlgorithmIntroduction.chap01.part2repetition;

// 두 변수 a, b에 정수를 입력하고 b-a를 출력하는 프로그램 작성
// 변수 b에 입력한 값이 a값 이하면 변수 b값을 다시 입력하기

import java.util.Scanner;

public class Practice09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        System.out.println("b-a 값을 구합니다.");

        System.out.println("a값: ");
        a = sc.nextInt();

        do {
            System.out.println("b값: ");
            b = sc.nextInt();
            if (b <= a) System.out.println("a보다 큰 값을 입력하세요!");
        } while (b <= a);

        int answer = b - a;
        System.out.println("b - a는 " + answer + "입니다.");
    }
}
