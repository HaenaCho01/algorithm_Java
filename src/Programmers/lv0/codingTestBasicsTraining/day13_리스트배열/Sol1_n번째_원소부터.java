package Programmers.lv0.codingTestBasicsTraining.day13_리스트배열;

class Solution1 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i + n - 1];
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 74.1MB)
테스트 2 〉	통과 (0.02ms, 74.2MB)
테스트 3 〉	통과 (0.03ms, 71.8MB)
테스트 4 〉	통과 (0.02ms, 77.3MB)
테스트 5 〉	통과 (0.02ms, 78.7MB)
테스트 6 〉	통과 (0.02ms, 85.6MB)
테스트 7 〉	통과 (0.03ms, 73.7MB)
테스트 8 〉	통과 (0.03ms, 71.1MB)
테스트 9 〉	통과 (0.02ms, 73.8MB)
테스트 10 〉	통과 (0.02ms, 76.8MB)
테스트 11 〉	통과 (0.02ms, 76.5MB)
테스트 12 〉	통과 (0.02ms, 78.9MB)
테스트 13 〉	통과 (0.02ms, 78.3MB)
테스트 14 〉	통과 (0.01ms, 85.1MB)
테스트 15 〉	통과 (0.02ms, 74.2MB)
테스트 16 〉	통과 (0.02ms, 77.5MB)
테스트 17 〉	통과 (0.02ms, 76.4MB)
테스트 18 〉	통과 (0.02ms, 66.5MB)
테스트 19 〉	통과 (0.01ms, 80.8MB)
테스트 20 〉	통과 (0.02ms, 78.9MB)
 */

public class Sol1_n번째_원소부터 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        for (int i : sol.solution(new int[]{2, 1, 6}, 3)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : sol.solution(new int[]{5,2,1,7,5}, 2)) {
            System.out.print(i + " ");
        }
    }
}
