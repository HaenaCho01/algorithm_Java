package Programmers.lv0.codingTestIntroduction.day2_사칙연산_조건문_배열;

public class Sol1_두_수의_나눗셈 {
    public int solution(double num1, double num2) {
        double division = num1 / num2 * 1000;
        int answer = (int)division;
        return answer;
    }
}
