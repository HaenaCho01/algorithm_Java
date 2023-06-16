package Programmers.lv0.codingTestBasicsTraining.day3_연산;

public class Sol4_더_크게_합치기 {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        System.out.println(sol.solution(9, 91));
        System.out.println(sol.solution(89, 8));
    }
}

class Solution4 {
    public int solution(int a, int b) {
        int answer = 0;

        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        String strAB = strA + strB;
        String strBA = strB + strA;
        int ab = Integer.parseInt(strAB);
        int ba = Integer.parseInt(strBA);

        if (ab >= ba) {
            answer = ab;
        } else if (ab < ba) {
            answer = ba;
        }

        return answer;
    }
}

/*
테스트 1 〉	통과 (1.15ms, 82.8MB)
테스트 2 〉	통과 (1.71ms, 78.6MB)
테스트 3 〉	통과 (2.74ms, 80MB)
테스트 4 〉	통과 (1.67ms, 72.9MB)
테스트 5 〉	통과 (11.90ms, 89.6MB)
테스트 6 〉	통과 (1.79ms, 78.5MB)
테스트 7 〉	통과 (1.31ms, 67.9MB)
테스트 8 〉	통과 (1.69ms, 65.1MB)
테스트 9 〉	통과 (1.63ms, 73.6MB)
테스트 10 〉	통과 (1.74ms, 77.5MB)
테스트 11 〉	통과 (1.41ms, 77.8MB)
테스트 12 〉	통과 (1.75ms, 74MB)
테스트 13 〉	통과 (1.46ms, 75.4MB)
테스트 14 〉	통과 (1.71ms, 79.5MB)
테스트 15 〉	통과 (1.73ms, 65MB)
테스트 16 〉	통과 (1.43ms, 83.2MB)
테스트 17 〉	통과 (1.44ms, 76.5MB)
테스트 18 〉	통과 (1.50ms, 76.5MB)
테스트 19 〉	통과 (1.50ms, 71.5MB)
테스트 20 〉	통과 (1.72ms, 76MB)
테스트 21 〉	통과 (1.96ms, 72.4MB)
테스트 22 〉	통과 (1.78ms, 80.5MB)
테스트 23 〉	통과 (2.18ms, 75.1MB)
 */