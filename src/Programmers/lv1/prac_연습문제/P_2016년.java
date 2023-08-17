package Programmers.lv1.prac_연습문제;

public class P_2016년 {
    public String solution(int a, int b) {
        String[] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int allDays = b;
        for (int i = 1; i < a; i++) {
            allDays += monthDays[i-1];
        }
        return week[allDays % 7];
    }

/*
테스트 1 〉	통과 (0.02ms, 77.5MB)
테스트 2 〉	통과 (0.04ms, 76.1MB)
테스트 3 〉	통과 (0.02ms, 71.2MB)
테스트 4 〉	통과 (0.02ms, 71.4MB)
테스트 5 〉	통과 (0.03ms, 73.7MB)
테스트 6 〉	통과 (0.02ms, 71.9MB)
테스트 7 〉	통과 (0.03ms, 75.4MB)
테스트 8 〉	통과 (0.04ms, 78MB)
테스트 9 〉	통과 (0.04ms, 75.2MB)
테스트 10 〉	통과 (0.02ms, 72.7MB)
테스트 11 〉	통과 (0.04ms, 76.1MB)
테스트 12 〉	통과 (0.03ms, 74.8MB)
테스트 13 〉	통과 (0.03ms, 77.1MB)
테스트 14 〉	통과 (0.02ms, 72.2MB)

 */

    public static void main(String[] args) {
        P_2016년 sol = new P_2016년();
        System.out.println(sol.solution(5, 24));
    }
}
