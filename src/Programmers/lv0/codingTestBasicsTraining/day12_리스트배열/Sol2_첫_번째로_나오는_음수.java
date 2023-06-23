package Programmers.lv0.codingTestBasicsTraining.day12_리스트배열;

class Solution2 {
    public int solution(int[] num_list) {
        int answer = -1;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}

public class Sol2_첫_번째로_나오는_음수 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        System.out.println(sol.solution(new int[]{12, 4, 15, 46, 38, -2, 15}));
        System.out.println(sol.solution(new int[]{13, 22, 53, 24, 15, 6}));
    }
}

/*
테스트 1 〉	통과 (0.01ms, 78.6MB)
테스트 2 〉	통과 (0.02ms, 73.6MB)
테스트 3 〉	통과 (0.02ms, 72.7MB)
테스트 4 〉	통과 (0.02ms, 78.1MB)
테스트 5 〉	통과 (0.02ms, 74.2MB)
테스트 6 〉	통과 (0.02ms, 75.5MB)
테스트 7 〉	통과 (0.03ms, 76.5MB)
테스트 8 〉	통과 (0.03ms, 77.2MB)
테스트 9 〉	통과 (0.02ms, 65.2MB)
테스트 10 〉	통과 (0.02ms, 83MB)
테스트 11 〉	통과 (0.02ms, 73.6MB)
테스트 12 〉	통과 (0.02ms, 72.4MB)
테스트 13 〉	통과 (0.03ms, 72.1MB)
테스트 14 〉	통과 (0.03ms, 72.5MB)
테스트 15 〉	통과 (0.05ms, 63.7MB)
테스트 16 〉	통과 (0.02ms, 76.9MB)
테스트 17 〉	통과 (0.02ms, 72.3MB)
테스트 18 〉	통과 (0.03ms, 78.5MB)
테스트 19 〉	통과 (0.02ms, 76.8MB)
 */
