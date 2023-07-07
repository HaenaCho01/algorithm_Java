package Programmers.lv0.codingTestIntroduction.day2_사칙연산_조건문_배열;

public class Sol1_두_수의_나눗셈 {
    public int solution(double num1, double num2) {
        double division = num1 / num2 * 1000;
        int answer = (int)division;
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 77.8MB)
테스트 2 〉	통과 (0.02ms, 71.9MB)
테스트 3 〉	통과 (0.01ms, 76MB)
테스트 4 〉	통과 (0.02ms, 76.3MB)
테스트 5 〉	통과 (0.02ms, 76.9MB)
테스트 6 〉	통과 (0.03ms, 70.3MB)
테스트 7 〉	통과 (0.02ms, 73.9MB)
테스트 8 〉	통과 (0.02ms, 77.7MB)
테스트 9 〉	통과 (0.03ms, 77.3MB)
테스트 10 〉	통과 (0.01ms, 77.9MB)
테스트 11 〉	통과 (0.02ms, 76.7MB)
테스트 12 〉	통과 (0.01ms, 67.7MB)
테스트 13 〉	통과 (0.01ms, 72MB)
테스트 14 〉	통과 (0.02ms, 73.8MB)
테스트 15 〉	통과 (0.03ms, 76.3MB)
테스트 16 〉	통과 (0.02ms, 78MB)
테스트 17 〉	통과 (0.01ms, 76.7MB)
테스트 18 〉	통과 (0.02ms, 74.6MB)
 */
