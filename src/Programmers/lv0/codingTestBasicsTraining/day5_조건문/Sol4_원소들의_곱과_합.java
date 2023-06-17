package Programmers.lv0.codingTestBasicsTraining.day5_조건문;

public class Sol4_원소들의_곱과_합 {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        System.out.println(sol.solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(sol.solution(new int[]{5, 7, 8, 3}));
    }
}

class Solution4 {
    public int solution(int[] num_list) {
        int answer = 0;

        int multiNum = 1; // 모든 원소들의 곱
        for (int i = 0; i < num_list.length; i++) {
            multiNum = multiNum * num_list[i];
        }

        int sumNum = 0; // 모든 원소들의 합의 제곱
        for (int i = 0; i < num_list.length; i++) {
            sumNum = sumNum + num_list[i];
        }
        int sumSquareNum = sumNum * sumNum;

        if (multiNum < sumSquareNum) {
            answer = 1;
        } else if (multiNum > sumSquareNum) {
            answer = 0;
        }

        return answer;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 72.4MB)
테스트 2 〉	통과 (0.02ms, 76.1MB)
테스트 3 〉	통과 (0.02ms, 77.4MB)
테스트 4 〉	통과 (0.02ms, 70.4MB)
테스트 5 〉	통과 (0.03ms, 72.5MB)
테스트 6 〉	통과 (0.02ms, 78.7MB)
테스트 7 〉	통과 (0.02ms, 75.7MB)
테스트 8 〉	통과 (0.02ms, 73.4MB)
테스트 9 〉	통과 (0.02ms, 76.5MB)
테스트 10 〉	통과 (0.02ms, 75.6MB)
테스트 11 〉	통과 (0.02ms, 73.4MB)
테스트 12 〉	통과 (0.01ms, 77.3MB)
테스트 13 〉	통과 (0.02ms, 76.7MB)
테스트 14 〉	통과 (0.02ms, 71.5MB)
테스트 15 〉	통과 (0.02ms, 76.1MB)
테스트 16 〉	통과 (0.02ms, 84MB)
테스트 17 〉	통과 (0.01ms, 79.1MB)
테스트 18 〉	통과 (0.02ms, 74.9MB)
테스트 19 〉	통과 (0.03ms, 74.3MB)
테스트 20 〉	통과 (0.03ms, 73.4MB)
 */
