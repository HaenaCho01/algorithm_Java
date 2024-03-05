package DoItAlgorithmIntroduction.chap01.part2repetition;

// for 문으로 1~n 까지의 합을 구함

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n값: ");
        int n = sc.nextInt();

        int sum = 0;

        // for 문: for (초기화 부분; 제어식; 업데이트 부분) 명령문
        for (int i = 1; i <= n; i++) sum += i;

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
