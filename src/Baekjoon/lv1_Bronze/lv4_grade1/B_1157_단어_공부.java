package Baekjoon.lv1_Bronze.lv4_grade1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B_1157_단어_공부 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 대소문자로 이루어진 단어를 받는다.
		String word = sc.nextLine();
		sc.close();

		// 대소문자를 구분하지 않으므로 대문자로 모두 변환한다.
		word = word.toUpperCase();

		// 알파벳순서 - 카운트가 담긴 2차원 배열을 만든다.
		int[][] alphabetCnt = new int[26][2];
		for (int i = 0; i < alphabetCnt.length; i++) {
			alphabetCnt[i][0] = i;
		}

		// 주어진 단어를 for문으로 돌면서 알파벳 순서에 맞게 카운트를 더한다.
		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i) - 'A';
			alphabetCnt[index][1]++;
		}

		// 카운트 수를 기준으로 내림차순 정렬한다.
		Arrays.sort(alphabetCnt, Comparator.comparingInt((int[] o) -> o[1]).reversed());

		// 가장 많이 사용된 알파벳이 여러 개 존재하는 지 확인한 후, 여러 개가 아니라면 해당 알파벳의 대문자를 출력한다.
		String answer = alphabetCnt[0][1] == alphabetCnt[1][1] ? "?" : String.valueOf((char) (alphabetCnt[0][0] + 'A'));
		System.out.println(answer);
	}
}
