package Programmers.lv0.codingTestBasicsTraining.day15_리스트배열_문자열;

class Solution4 {
    public int solution(int[] num_list) {
        int answer = 0;
        if (num_list.length >= 11) {
            int sum = 0;
            for (int i : num_list) {
                sum += i;
            }
            answer = sum;
        } else if (num_list.length <= 10) {
            int mul = 1;
            for (int i : num_list) {
                mul *= i;
            }
            answer = mul;
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.03ms, 77.2MB)
테스트 2 〉	통과 (0.02ms, 77.6MB)
테스트 3 〉	통과 (0.02ms, 70.9MB)
테스트 4 〉	통과 (0.02ms, 76.6MB)
테스트 5 〉	통과 (0.02ms, 67.4MB)
테스트 6 〉	통과 (0.02ms, 74.8MB)
테스트 7 〉	통과 (0.01ms, 73.3MB)
테스트 8 〉	통과 (0.02ms, 78.1MB)
테스트 9 〉	통과 (0.02ms, 76.8MB)
테스트 10 〉	통과 (0.01ms, 74.3MB)
테스트 11 〉	통과 (0.01ms, 71.1MB)
테스트 12 〉	통과 (0.02ms, 73.2MB)
테스트 13 〉	통과 (0.01ms, 73.3MB)
테스트 14 〉	통과 (0.02ms, 71.9MB)
테스트 15 〉	통과 (0.03ms, 75MB)
테스트 16 〉	통과 (0.02ms, 74.5MB)
테스트 17 〉	통과 (0.03ms, 81.7MB)
테스트 18 〉	통과 (0.03ms, 72MB)
테스트 19 〉	통과 (0.01ms, 71.1MB)
테스트 20 〉	통과 (0.02ms, 74.2MB)
 */

public class Sol4_길이에_따른_연산 {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        System.out.println(sol.solution(new int[]{3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1}));
        System.out.println(sol.solution(new int[]{2, 3, 4, 5}));
    }
}
