package Programmers.lv0.codingTestBasicsTraining.day14_리스트배열;

class Solution4 {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int number : numbers) {
            answer += number;
            if (answer > n) {
                break;
            }
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.03ms, 72MB)
테스트 2 〉	통과 (0.03ms, 79.7MB)
테스트 3 〉	통과 (0.02ms, 78.1MB)
테스트 4 〉	통과 (0.02ms, 78.3MB)
테스트 5 〉	통과 (0.03ms, 72.6MB)
테스트 6 〉	통과 (0.02ms, 80.9MB)
테스트 7 〉	통과 (0.03ms, 73.4MB)
테스트 8 〉	통과 (0.02ms, 75.3MB)
테스트 9 〉	통과 (0.02ms, 78.7MB)
테스트 10 〉	통과 (0.02ms, 77.3MB)
테스트 11 〉	통과 (0.02ms, 76.7MB)
테스트 12 〉	통과 (0.04ms, 74.3MB)
 */

public class Sol4_n보다_커질_때까지_더하기 {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        System.out.println(sol.solution(new int[]{34, 5, 71, 29, 100, 34}, 123));
        System.out.println(sol.solution(new int[]{58, 44, 27, 10, 100}, 139));
    }
}
