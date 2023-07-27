package Programmers.lv0.codingTestIntroduction.day15_문자열_해시_배열_수학;

public class Sol1_영어가_싫어요 {
	public long solution(String numbers) {
		String[] numStrArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		for (int i = 0; i < numStrArr.length; i++) {
			numbers = numbers.replace(numStrArr[i], Long.toString(i));
		}
		return Long.parseLong(numbers);
	}

	public static void main(String[] args) {
		Sol1_영어가_싫어요 sol = new Sol1_영어가_싫어요();
		System.out.println(sol.solution("onetwothreefourfivesixseveneightnine"));
		System.out.println(sol.solution("onefourzerosixseven"));
	}
}

/*
테스트 1 〉	통과 (0.18ms, 76.8MB)
테스트 2 〉	통과 (0.15ms, 72.1MB)
테스트 3 〉	통과 (0.11ms, 76.2MB)
테스트 4 〉	통과 (0.10ms, 74.7MB)
테스트 5 〉	통과 (0.14ms, 72.3MB)
테스트 6 〉	통과 (0.15ms, 74.9MB)
테스트 7 〉	통과 (0.10ms, 74.1MB)
테스트 8 〉	통과 (0.11ms, 79.4MB)
테스트 9 〉	통과 (0.16ms, 77.6MB)
 */