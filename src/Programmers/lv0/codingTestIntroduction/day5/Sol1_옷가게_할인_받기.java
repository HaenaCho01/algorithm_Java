package Programmers.lv0.codingTestIntroduction.day5;

public class Sol1_옷가게_할인_받기 {
	public int solution(int price) {
		double answer = price;
		if (price >= 100000) {
			answer = price * 0.95;
		}
		if (price >= 300000) {
			answer = price * 0.9;
		}
		if (price >= 500000) {
			answer = price * 0.8;
		}
		return (int) answer;
	}

	public static void main(String[] args) {
		Sol1_옷가게_할인_받기 sol = new Sol1_옷가게_할인_받기();
		System.out.println(sol.solution(150000));
		System.out.println(sol.solution(580000));
		System.out.println(sol.solution(500093));
		System.out.println(sol.solution(400074));
	}
}

/*
테스트 1 〉	통과 (0.01ms, 84.6MB)
테스트 2 〉	통과 (0.02ms, 73.4MB)
테스트 3 〉	통과 (0.02ms, 76.2MB)
테스트 4 〉	통과 (0.02ms, 75.5MB)
테스트 5 〉	통과 (0.02ms, 77.2MB)
테스트 6 〉	통과 (0.01ms, 73.3MB)
테스트 7 〉	통과 (0.03ms, 80.7MB)
테스트 8 〉	통과 (0.02ms, 76.6MB)
테스트 9 〉	통과 (0.01ms, 75.8MB)
테스트 10 〉	통과 (0.02ms, 73.4MB)
테스트 11 〉	통과 (0.04ms, 76.3MB)
테스트 12 〉	통과 (0.02ms, 74.5MB)
테스트 13 〉	통과 (0.01ms, 73.5MB)
테스트 14 〉	통과 (0.02ms, 80.4MB)
테스트 15 〉	통과 (0.03ms, 72.1MB)
테스트 16 〉	통과 (0.02ms, 74.5MB)
테스트 17 〉	통과 (0.01ms, 76.7MB)
테스트 18 〉	통과 (0.02ms, 76.4MB)
테스트 19 〉	통과 (0.02ms, 72.7MB)
테스트 20 〉	통과 (0.02ms, 72.3MB)
 */
