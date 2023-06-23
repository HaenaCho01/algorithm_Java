package Programmers.lv0.codingTestBasicsTraining.day11_리스트배열;

class Solution2 {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = k * (i+1);
        }
        return answer;
    }
}

public class Sol2_배열_만들기_1 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        for (int i : sol.solution(10, 3)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : sol.solution(15, 5)) {
            System.out.print(i + " ");
        }
    }
}

/*
테스트 1 〉	통과 (0.01ms, 81.1MB)
테스트 2 〉	통과 (0.02ms, 74.5MB)
테스트 3 〉	통과 (0.02ms, 81.5MB)
테스트 4 〉	통과 (0.02ms, 73.3MB)
테스트 5 〉	통과 (0.02ms, 72MB)
테스트 6 〉	통과 (0.02ms, 78.4MB)
테스트 7 〉	통과 (0.02ms, 71.9MB)
테스트 8 〉	통과 (0.01ms, 76.5MB)
테스트 9 〉	통과 (0.02ms, 77.5MB)
테스트 10 〉	통과 (0.08ms, 75.6MB)
테스트 11 〉	통과 (0.02ms, 74.4MB)
 */
