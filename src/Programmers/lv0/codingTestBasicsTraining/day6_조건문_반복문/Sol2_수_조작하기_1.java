package Programmers.lv0.codingTestBasicsTraining.day6_조건문_반복문;

public class Sol2_수_조작하기_1 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        System.out.println(sol.solution(0, "wsdawsdassw"));
    }
}

class Solution2 {
    public int solution(int n, String control) {
        int answer = n;
        for (int i = 0; i < control.length(); i++) {
            char controlChar = control.charAt(i);
            switch (controlChar) {
                case 'w' : answer = answer + 1; break;
                case 's' : answer = answer - 1; break;
                case 'd' : answer = answer + 10; break;
                case 'a' : answer = answer -10; break;
            }
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (1.28ms, 76.4MB)
테스트 2 〉	통과 (5.64ms, 79.4MB)
테스트 3 〉	통과 (0.83ms, 74.7MB)
테스트 4 〉	통과 (5.20ms, 76.4MB)
테스트 5 〉	통과 (5.69ms, 81.3MB)
테스트 6 〉	통과 (5.95ms, 72.5MB)
테스트 7 〉	통과 (2.77ms, 73.8MB)
테스트 8 〉	통과 (1.09ms, 78.5MB)
테스트 9 〉	통과 (4.90ms, 84.7MB)
테스트 10 〉	통과 (0.80ms, 71.8MB)
테스트 11 〉	통과 (1.39ms, 73.6MB)
 */
