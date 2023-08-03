package Programmers.lv0.codingTestIntroduction.day23_배열_정렬_문자열;

public class Sol4_로그인_성공 {
	public String solution(String[] id_pw, String[][] db) {
		String msg = "fail";
		for (int i = 0; i < db.length; i++) {
			if (db[i][0].equals(id_pw[0])) {
				msg = "wrong pw";
				if (db[i][1].equals(id_pw[1])) {
					msg = "login";
					break;
				}
			}
		}
		return msg;
	}

	public static void main(String[] args) {
		Sol4_로그인_성공 sol = new Sol4_로그인_성공();
		System.out.println(sol.solution(new String[]{"meosseugi", "1234"}, new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}));
		System.out.println(sol.solution(new String[]{"programmer01", "15789"}, new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}}));
		System.out.println(sol.solution(new String[]{"rabbit04", "98761"}, new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}}));
	}
}

/*
테스트 1 〉	통과 (0.02ms, 76.1MB)
테스트 2 〉	통과 (0.01ms, 72.9MB)
테스트 3 〉	통과 (0.02ms, 72.5MB)
테스트 4 〉	통과 (0.03ms, 72.9MB)
테스트 5 〉	통과 (0.01ms, 76.1MB)
테스트 6 〉	통과 (0.02ms, 77.7MB)
테스트 7 〉	통과 (0.02ms, 74.9MB)
테스트 8 〉	통과 (0.04ms, 69.2MB)
 */