package Programmers.lv0.codingTestIntroduction.day7_문자열_조건문_수학_반복문;

public class Sol3_양꼬치 {
    public int solution(int n, int k) {
        return n * 12000 + (k - (n/10)) * 2000;
    }

    public static void main(String[] args) {
        Sol3_양꼬치 sol = new Sol3_양꼬치();
        System.out.println(sol.solution(10, 3));
        System.out.println(sol.solution(64, 6));
    }
}

/*
테스트 1 〉	통과 (0.02ms, 71.8MB)
테스트 2 〉	통과 (0.02ms, 69.9MB)
테스트 3 〉	통과 (0.02ms, 80.1MB)
테스트 4 〉	통과 (0.02ms, 74.4MB)
테스트 5 〉	통과 (0.02ms, 75.2MB)
테스트 6 〉	통과 (0.03ms, 74.4MB)
테스트 7 〉	통과 (0.03ms, 73.3MB)
 */
