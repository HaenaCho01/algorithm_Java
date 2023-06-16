package Baekjoon.lv1_Bronze.lv0_grade5;

import java.util.Scanner;

public class B_2475_검증수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 첫째 줄에 고유번호의 처음 5자리 숫자들이 빈칸을 사이에 두고 하나씩 주어짐
        String uniqueNum = sc.nextLine();
        String[] numArr = uniqueNum.split(" ");
        int uniqueNumSquareSum = 0;


        for (int i = 0; i < numArr.length; i++) {
            int num = Integer.parseInt(numArr[i]);
            uniqueNumSquareSum = uniqueNumSquareSum + (num * num);
        }

        // 검증수(각 숫자를 제곱한 수들의 합을 10으로 나눈 나머지) 출력
        int checkNum = uniqueNumSquareSum % 10;
        System.out.println(checkNum);
    }
}
