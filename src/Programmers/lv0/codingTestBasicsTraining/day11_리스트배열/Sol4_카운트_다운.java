package Programmers.lv0.codingTestBasicsTraining.day11_리스트배열;

class Solution4 {
    public int[] solution(int start, int end) {
        int[] answer = new int[start-end+1];
        answer[0] = start;
        for (int i = 1; i < answer.length; i++) {
            answer[i] = answer[i-1] - 1;
        }
        return answer;
    }
}

public class Sol4_카운트_다운 {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        for (int i : sol.solution(10, 3)) {
            System.out.print(i + " ");
        }
    }
}

/*
테스트 1 〉	통과 (0.02ms, 72.2MB)
테스트 2 〉	통과 (0.02ms, 72.5MB)
테스트 3 〉	통과 (0.02ms, 84.5MB)
테스트 4 〉	통과 (0.01ms, 71.9MB)
테스트 5 〉	통과 (0.01ms, 75MB)
테스트 6 〉	통과 (0.03ms, 75.2MB)
테스트 7 〉	통과 (0.01ms, 67.1MB)
테스트 8 〉	통과 (0.02ms, 74.2MB)
테스트 9 〉	통과 (0.02ms, 82.7MB)
테스트 10 〉	통과 (0.02ms, 73.5MB)
테스트 11 〉	통과 (0.01ms, 71.3MB)
테스트 12 〉	통과 (0.03ms, 81.3MB)
테스트 13 〉	통과 (0.01ms, 75.7MB)
테스트 14 〉	통과 (0.02ms, 72.3MB)
테스트 15 〉	통과 (0.03ms, 75.9MB)
테스트 16 〉	통과 (0.02ms, 76.3MB)
테스트 17 〉	통과 (0.01ms, 78.7MB)
테스트 18 〉	통과 (0.03ms, 82.2MB)
테스트 19 〉	통과 (0.02ms, 76MB)
 */
