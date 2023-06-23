package Programmers.lv0.codingTestBasicsTraining.day11_리스트배열;

class Solution5 {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer = i;
                break;
            }
            else {
                answer = -1;
            }
        }
        return answer;
    }
}

public class Sol5_가까운_1_찾기 {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        System.out.println(sol.solution(new int [] {0, 0, 0, 1}, 1));
        System.out.println(sol.solution(new int [] {1, 0, 0, 1, 0, 0}, 4));
        System.out.println(sol.solution(new int [] {1, 1, 1, 1, 0}, 3));
    }
}

/*
테스트 1 〉	통과 (0.05ms, 83MB)
테스트 2 〉	통과 (0.03ms, 77.2MB)
테스트 3 〉	통과 (0.02ms, 77.4MB)
테스트 4 〉	통과 (0.02ms, 73.4MB)
테스트 5 〉	통과 (0.02ms, 69.9MB)
테스트 6 〉	통과 (0.02ms, 75MB)
테스트 7 〉	통과 (0.02ms, 86MB)
테스트 8 〉	통과 (0.02ms, 78.4MB)
테스트 9 〉	통과 (0.02ms, 75.3MB)
테스트 10 〉	통과 (0.06ms, 76.4MB)
테스트 11 〉	통과 (0.04ms, 79.3MB)
 */