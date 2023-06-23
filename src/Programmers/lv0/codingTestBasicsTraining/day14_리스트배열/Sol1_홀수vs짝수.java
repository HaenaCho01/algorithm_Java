package Programmers.lv0.codingTestBasicsTraining.day14_리스트배열;

class Solution1 {
    public int solution(int[] num_list) {
        int oddSum = 0; int evenSum = 0;
        for (int i = 0; i < num_list.length; i = i+2) {
            oddSum += num_list[i];
        }
        for (int i = 1; i < num_list.length; i = i+2) {
            evenSum += num_list[i];
        }
        int answer = (oddSum >= evenSum) ? oddSum : evenSum;
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.01ms, 76.1MB)
테스트 2 〉	통과 (0.02ms, 73.9MB)
테스트 3 〉	통과 (0.02ms, 75.1MB)
테스트 4 〉	통과 (0.02ms, 69.9MB)
테스트 5 〉	통과 (0.02ms, 76.3MB)
테스트 6 〉	통과 (0.02ms, 80MB)
테스트 7 〉	통과 (0.02ms, 73.9MB)
테스트 8 〉	통과 (0.03ms, 78.8MB)
테스트 9 〉	통과 (0.02ms, 78.8MB)
테스트 10 〉	통과 (0.02ms, 78.1MB)
테스트 11 〉	통과 (0.03ms, 77.8MB)
테스트 12 〉	통과 (0.02ms, 75.2MB)
테스트 13 〉	통과 (0.03ms, 71.9MB)
테스트 14 〉	통과 (0.02ms, 72.1MB)
테스트 15 〉	통과 (0.03ms, 82.7MB)
테스트 16 〉	통과 (0.01ms, 76.3MB)
테스트 17 〉	통과 (0.02ms, 72.7MB)
테스트 18 〉	통과 (0.01ms, 70.1MB)
테스트 19 〉	통과 (0.02ms, 72.8MB)
테스트 20 〉	통과 (0.02ms, 74.3MB)
테스트 21 〉	통과 (0.01ms, 80.5MB)
테스트 22 〉	통과 (0.03ms, 75.9MB)
테스트 23 〉	통과 (0.02ms, 76.9MB)
테스트 24 〉	통과 (0.02ms, 78.3MB)
테스트 25 〉	통과 (0.02ms, 76.1MB)
 */

public class Sol1_홀수vs짝수 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        System.out.println(sol.solution(new int[]{4, 2, 6, 1, 7, 6}));
        System.out.println(sol.solution(new int[]{-1, 2, 5, 6, 3}));
    }
}
