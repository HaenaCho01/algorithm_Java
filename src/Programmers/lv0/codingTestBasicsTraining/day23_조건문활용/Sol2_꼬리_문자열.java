package Programmers.lv0.codingTestBasicsTraining.day23_조건문활용;

class Solution2 {
	public String solution(String[] str_list, String ex) {
		StringBuilder sb = new StringBuilder();
		for (String s : str_list) {
			if (!s.contains(ex)) {
				sb.append(s);
			}
		}
		return sb.toString();
	}
}

/*
테스트 1 〉	통과 (0.05ms, 81.9MB)
테스트 2 〉	통과 (0.05ms, 73.6MB)
테스트 3 〉	통과 (0.04ms, 76.7MB)
테스트 4 〉	통과 (0.03ms, 81.4MB)
테스트 5 〉	통과 (0.06ms, 77.5MB)
테스트 6 〉	통과 (0.04ms, 71.4MB)
테스트 7 〉	통과 (0.05ms, 73.4MB)
테스트 8 〉	통과 (0.04ms, 68.1MB)
테스트 9 〉	통과 (0.03ms, 72.9MB)
테스트 10 〉	통과 (0.04ms, 76.9MB)
테스트 11 〉	통과 (0.06ms, 74.8MB)
테스트 12 〉	통과 (0.05ms, 78.6MB)
테스트 13 〉	통과 (0.04ms, 78.2MB)
테스트 14 〉	통과 (0.05ms, 75.1MB)
테스트 15 〉	통과 (0.06ms, 73.8MB)
테스트 16 〉	통과 (0.04ms, 76.3MB)
테스트 17 〉	통과 (0.03ms, 74.2MB)
테스트 18 〉	통과 (0.04ms, 71.6MB)
테스트 19 〉	통과 (0.04ms, 74.2MB)
 */

public class Sol2_꼬리_문자열 {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		System.out.println(sol.solution(new String[]{"abc", "def", "ghi"}, "ef"));
		System.out.println(sol.solution(new String[]{"abc", "bbc", "cbc"}, "c"));
	}
}
