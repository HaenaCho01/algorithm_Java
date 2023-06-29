package Programmers.lv0.codingTestBasicsTraining.day20_함수메서드;

class Solution2 {
	public int solution(int[] arr1, int[] arr2) {
		int answer = 0;
		if (arr1.length != arr2.length) {
			answer = arr1.length > arr2.length ? 1 : -1;
		} else {
			int arr1Sum = 0; int arr2Sum = 0;
			for (int i = 0; i < arr1.length; i++) {
				arr1Sum += arr1[i];
				arr2Sum += arr2[i];
			}
			if (arr1Sum != arr2Sum) {
				answer = arr1Sum > arr2Sum ? 1 : -1;
			}
		}
		return answer;
	}
}

/*
테스트 1 〉	통과 (0.02ms, 71.5MB)
테스트 2 〉	통과 (0.02ms, 78.4MB)
테스트 3 〉	통과 (0.02ms, 76.1MB)
테스트 4 〉	통과 (0.02ms, 69.8MB)
테스트 5 〉	통과 (0.02ms, 77.5MB)
테스트 6 〉	통과 (0.04ms, 73.6MB)
테스트 7 〉	통과 (0.02ms, 80.9MB)
테스트 8 〉	통과 (0.03ms, 71.9MB)
테스트 9 〉	통과 (0.02ms, 73.4MB)
테스트 10 〉	통과 (0.02ms, 76.8MB)
테스트 11 〉	통과 (0.02ms, 76.3MB)
테스트 12 〉	통과 (0.01ms, 72.6MB)
테스트 13 〉	통과 (0.03ms, 74.3MB)
테스트 14 〉	통과 (0.02ms, 76.4MB)
테스트 15 〉	통과 (0.02ms, 73.8MB)
테스트 16 〉	통과 (0.03ms, 67.4MB)
테스트 17 〉	통과 (0.03ms, 72MB)
테스트 18 〉	통과 (0.02ms, 71.4MB)
테스트 19 〉	통과 (0.02ms, 71.8MB)
테스트 20 〉	통과 (0.02ms, 74.9MB)
테스트 21 〉	통과 (0.02ms, 77.3MB)
테스트 22 〉	통과 (0.03ms, 70.4MB)
테스트 23 〉	통과 (0.03ms, 72.7MB)
테스트 24 〉	통과 (0.02ms, 79.7MB)
테스트 25 〉	통과 (0.02ms, 75.1MB)
 */

public class Sol2_배열_비교하기 {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		System.out.println(sol.solution(new int[]{49, 13}, new int[]{70, 11, 2}));
		System.out.println(sol.solution(new int[]{100, 17, 84, 1}, new int[]{55, 12, 65, 36}));
		System.out.println(sol.solution(new int[]{1, 2, 3, 4, 5}, new int[]{3, 3, 3, 3, 3}));
	}
}
