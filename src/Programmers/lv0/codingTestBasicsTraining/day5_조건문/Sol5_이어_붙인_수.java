package Programmers.lv0.codingTestBasicsTraining.day5_조건문;

public class Sol5_이어_붙인_수 {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        System.out.println(sol.solution(new int[]{3, 4, 5, 2, 1}));
        System.out.println(sol.solution(new int[]{5, 7, 8, 3}));
    }
}

class Solution5 {
    public int solution(int[] num_list) {
        StringBuilder oddNum = new StringBuilder(); // 홀수 붙이기
        StringBuilder evenNum = new StringBuilder();;// 짝수 붙이기
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 1) {
                oddNum.append(num_list[i]);
            } else if (num_list[i] % 2 == 0) {
                evenNum.append(num_list[i]);
            }
        }

        int answer = Integer.parseInt(oddNum.toString()) + Integer.parseInt(evenNum.toString());
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.03ms, 75.2MB)
테스트 2 〉	통과 (0.04ms, 72.8MB)
테스트 3 〉	통과 (0.09ms, 74.1MB)
테스트 4 〉	통과 (0.06ms, 74.1MB)
테스트 5 〉	통과 (0.04ms, 80.6MB)
테스트 6 〉	통과 (0.07ms, 76.6MB)
테스트 7 〉	통과 (0.04ms, 78.4MB)
테스트 8 〉	통과 (0.06ms, 67.8MB)
테스트 9 〉	통과 (0.05ms, 70.8MB)
테스트 10 〉	통과 (0.05ms, 77.4MB)
테스트 11 〉	통과 (0.04ms, 78MB)
테스트 12 〉	통과 (0.04ms, 76.1MB)
테스트 13 〉	통과 (0.05ms, 74MB)
테스트 14 〉	통과 (0.05ms, 79.7MB)
테스트 15 〉	통과 (0.04ms, 83MB)
테스트 16 〉	통과 (0.04ms, 74.3MB)
테스트 17 〉	통과 (0.05ms, 78.4MB)
테스트 18 〉	통과 (0.05ms, 74.6MB)
테스트 19 〉	통과 (0.04ms, 72.2MB)
테스트 20 〉	통과 (0.05ms, 77.1MB)
 */
