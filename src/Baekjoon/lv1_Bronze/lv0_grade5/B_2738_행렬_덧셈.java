package Baekjoon.lv1_Bronze.lv0_grade5;

import java.util.Scanner;

public class B_2738_행렬_덧셈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫째 줄에 행렬의 크기 n, m 주어짐 (행 n * 열 m)
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[][] arrA = new int[n][m];
        int[][] arrB = new int[n][m];
        int[][] arrAnswer = new int[n][m];

        // 둘째 줄부터 행렬 A: n개 줄에 원소 m개(공백으로 구분) 차례대로 주어짐
        for (int i = 0; i < n; i++) {
            String strLn = sc.nextLine();
            String[] strArr = strLn.split(" ");
            int[] intArr = new int[m];
            for (int j = 0; j < m; j++) {
                intArr[j] = Integer.parseInt(strArr[j]);
            }
                arrA[i] = intArr;
        }

        // 이어서 행렬 B: n개 줄에 원소 m개 차례대로 주어짐
        for (int i = 0; i < n; i++) {
            String strLn = sc.nextLine();
            String[] strArr = strLn.split(" ");
            int[] intArr = new int[m];
            for (int j = 0; j < m; j++) {
                intArr[j] = Integer.parseInt(strArr[j]);
            }
            arrB[i] = intArr;
        }

        // 행렬 A + B => (원소 공백으로 구분) 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arrAnswer[i][j] = arrA[i][j] + arrB[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            int[] inArr = arrAnswer[i];
            for (int j = 0; j < m; j++) {
                System.out.print(inArr[j] + " ");
            }
            System.out.println();
        }
    }
}
