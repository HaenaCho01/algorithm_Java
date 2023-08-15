package Programmers.lv1.prac_연습문제;

public class P_핸드폰_번호_가리기 {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < phone_number.length() - 4; i++) {
            sb.append('*');
        }
        sb.append(phone_number.substring(phone_number.length() - 4));
        return sb.toString();
    }

/*
테스트 1 〉	통과 (0.03ms, 77.5MB)
테스트 2 〉	통과 (0.03ms, 74.7MB)
테스트 3 〉	통과 (0.05ms, 77.7MB)
테스트 4 〉	통과 (0.04ms, 73.7MB)
테스트 5 〉	통과 (0.04ms, 77.1MB)
테스트 6 〉	통과 (0.05ms, 71.9MB)
테스트 7 〉	통과 (0.04ms, 72.6MB)
테스트 8 〉	통과 (0.05ms, 86.2MB)
테스트 9 〉	통과 (0.04ms, 72.9MB)
테스트 10 〉	통과 (0.05ms, 78.1MB)
테스트 11 〉	통과 (0.03ms, 76.5MB)
테스트 12 〉	통과 (0.02ms, 70.5MB)
테스트 13 〉	통과 (0.04ms, 76.1MB)
 */

    public static void main(String[] args) {
        P_핸드폰_번호_가리기 sol = new P_핸드폰_번호_가리기();
        System.out.println(sol.solution("01033334444"));
        System.out.println(sol.solution("027778888"));
    }
}
