package Programmers.lv0.codingTestBasicsTraining.day3_연산;

public class Sol5_두_수의_연산값_비교하기 {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        System.out.println(sol.solution(2, 91));
        System.out.println(sol.solution(91, 2));
    }
}

class Solution5 {
    public int solution(int a, int b) {
        int answer = 0;

        StringBuilder strAb = new StringBuilder();
        strAb.append(a);
        strAb.append(b);
        int ab1 = Integer.parseInt(String.valueOf(strAb));
        int ab2 = 2 * a * b;

        if (ab1 >=ab2) {
            answer = ab1;
        } else if(ab1 < ab2) {
            answer = ab2;
        }

        return answer;
    }
}

/*

테스트 1 〉	통과 (0.05ms, 72.2MB)
테스트 2 〉	통과 (0.05ms, 83.5MB)
테스트 3 〉	통과 (0.05ms, 81.4MB)
테스트 4 〉	통과 (0.06ms, 71.8MB)
테스트 5 〉	통과 (0.05ms, 71.6MB)
테스트 6 〉	통과 (0.04ms, 79MB)
테스트 7 〉	통과 (0.05ms, 73.7MB)
테스트 8 〉	통과 (0.05ms, 80.9MB)
테스트 9 〉	통과 (0.06ms, 71.7MB)
테스트 10 〉	통과 (0.05ms, 86.7MB)
테스트 11 〉	통과 (0.04ms, 73.1MB)
테스트 12 〉	통과 (0.06ms, 66.1MB)
테스트 13 〉	통과 (0.05ms, 77.4MB)
테스트 14 〉	통과 (0.04ms, 73.5MB)
테스트 15 〉	통과 (0.05ms, 70.4MB)
테스트 16 〉	통과 (0.06ms, 72.1MB)
테스트 17 〉	통과 (0.06ms, 71.9MB)
테스트 18 〉	통과 (0.04ms, 75.2MB)
테스트 19 〉	통과 (0.04ms, 78.3MB)
테스트 20 〉	통과 (5.30ms, 75.1MB)
테스트 21 〉	통과 (0.06ms, 71.9MB)
테스트 22 〉	통과 (0.05ms, 78.3MB)
테스트 23 〉	통과 (0.05ms, 74.3MB)
 */
