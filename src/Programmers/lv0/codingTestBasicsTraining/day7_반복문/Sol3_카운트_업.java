package Programmers.lv0.codingTestBasicsTraining.day7_반복문;

public class Sol3_카운트_업 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        for (int a : sol.solution(3, 10)) {
            System.out.print(a + " ");
        }
    }
}

class Solution3 {
    public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start + i;
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 74.1MB)
테스트 2 〉	통과 (0.03ms, 72.8MB)
테스트 3 〉	통과 (0.01ms, 73MB)
테스트 4 〉	통과 (0.03ms, 80.3MB)
테스트 5 〉	통과 (0.02ms, 74.6MB)
테스트 6 〉	통과 (0.02ms, 71.6MB)
테스트 7 〉	통과 (0.01ms, 77.2MB)
테스트 8 〉	통과 (0.01ms, 65.5MB)
테스트 9 〉	통과 (0.01ms, 72.4MB)
테스트 10 〉	통과 (0.02ms, 73.2MB)
테스트 11 〉	통과 (0.02ms, 76.9MB)
테스트 12 〉	통과 (0.01ms, 79.6MB)
테스트 13 〉	통과 (0.01ms, 72.7MB)
테스트 14 〉	통과 (0.02ms, 74.2MB)
테스트 15 〉	통과 (0.02ms, 73.1MB)
테스트 16 〉	통과 (0.01ms, 73.5MB)
테스트 17 〉	통과 (0.02ms, 73MB)
테스트 18 〉	통과 (0.01ms, 74.3MB)
테스트 19 〉	통과 (0.02ms, 85.6MB)
 */
