package Programmers.lv0.codingTestBasicsTraining.day2_출력_연산;

import java.util.Scanner;

public class Sol4_홀짝_구분하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else if (n % 2 == 1) {
            System.out.println(n + " is odd");
        }
    }
}

/*
테스트 1 〉	통과 (675.93ms, 67.4MB)
테스트 2 〉	통과 (293.49ms, 63.1MB)
테스트 3 〉	통과 (219.25ms, 73.6MB)
테스트 4 〉	통과 (366.55ms, 73.1MB)
 */
