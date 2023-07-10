package Programmers.lv0.codingTestIntroduction.day7_문자열_조건문_수학_반복문;

public class Sol2_각도기 {
    public int solution(int angle) {
        int answer = 0;
        if (angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle == 180) {
            answer = 4;
        } else {
            answer = 3;
        }
        return answer;
    }

    public static void main(String[] args) {
        Sol2_각도기 sol = new Sol2_각도기();
        System.out.println(sol.solution(70));
        System.out.println(sol.solution(90));
        System.out.println(sol.solution(91));
        System.out.println(sol.solution(180));
    }
}

/*
테스트 1 〉	통과 (0.02ms, 68.4MB)
테스트 2 〉	통과 (0.01ms, 77.3MB)
테스트 3 〉	통과 (0.02ms, 76.3MB)
테스트 4 〉	통과 (0.03ms, 77.7MB)
테스트 5 〉	통과 (0.01ms, 76.7MB)
테스트 6 〉	통과 (0.02ms, 75.2MB)
테스트 7 〉	통과 (0.02ms, 76.4MB)
테스트 8 〉	통과 (0.03ms, 75.6MB)
 */