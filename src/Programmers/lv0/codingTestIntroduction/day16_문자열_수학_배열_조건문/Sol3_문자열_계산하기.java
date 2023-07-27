package Programmers.lv0.codingTestIntroduction.day16_문자열_수학_배열_조건문;

public class Sol3_문자열_계산하기 {
	public int solution(String my_string) {
		String[] arr = my_string.split(" ");
		int answer = Integer.parseInt(arr[0]);
		for (int i = 1; i < arr.length - 1; i += 2) {
			if (arr[i].equals("+")) {
				answer += Integer.parseInt(arr[i + 1]);
			} else {
				answer -= Integer.parseInt(arr[i + 1]);
			}
		}
		return answer;
	}

/*
테스트 1 〉	통과 (0.11ms, 80.6MB)
테스트 2 〉	통과 (0.09ms, 78.2MB)
테스트 3 〉	통과 (0.10ms, 69.6MB)
테스트 4 〉	통과 (0.10ms, 78.5MB)
테스트 5 〉	통과 (0.13ms, 68.4MB)
테스트 6 〉	통과 (0.14ms, 76.3MB)
테스트 7 〉	통과 (0.13ms, 71.6MB)
테스트 8 〉	통과 (0.08ms, 71.8MB)
테스트 9 〉	통과 (0.10ms, 69.4MB)
테스트 10 〉	통과 (0.11ms, 76.2MB)
 */

	public static void main(String[] args) {
		Sol3_문자열_계산하기 sol = new Sol3_문자열_계산하기();
		System.out.println(sol.solution("3 + 4"));
	}
}
