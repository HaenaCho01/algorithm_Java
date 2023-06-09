package Programmers.lv0.codingTestIntroduction.day3_사칙연산_배열_수학;
// 나머지 구하기
//문제 설명
//정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
//
//제한사항
//0 < num1 ≤ 100
//0 < num2 ≤ 100
//입출력 예
//num1	num2	result
//3	2	1
//10	5	0
//입출력 예 설명
//입출력 예 #1
//
//num1이 3, num2가 2이므로 3을 2로 나눈 나머지 1을 return 합니다.
//입출력 예 #2
//
//num1이 10, num2가 5이므로 10을 5로 나눈 나머지 0을 return 합니다.

public class Sol1_나머지_구하기_O {
    public int solution(int num1, int num2) {
        int answer = num1 % num2;
        return answer;
    }
}
