package Programmers.lv0.codingTestBasicsTraining.day11_리스트배열;

class Solution1 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 65 && my_string.charAt(i) <= 90) {
                int index = my_string.charAt(i)-65;
                answer[index]++;
            }
            else if (my_string.charAt(i) >= 97 && my_string.charAt(i) <= 122) {
                int index = my_string.charAt(i)-97 + 26;
                answer[index]++;
            }
        }
        return answer;
    }
}

public class Sol1_문자_개수_세기 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        for (int s : sol.solution("Programmers")) {
            System.out.println(s + " ");
        }
    }
}

/*
테스트 1 〉	통과 (0.01ms, 73.4MB)
테스트 2 〉	통과 (0.02ms, 78.6MB)
테스트 3 〉	통과 (0.03ms, 69MB)
테스트 4 〉	통과 (0.04ms, 72.9MB)
테스트 5 〉	통과 (0.04ms, 71.1MB)
테스트 6 〉	통과 (0.03ms, 73.5MB)
테스트 7 〉	통과 (0.07ms, 75.7MB)
테스트 8 〉	통과 (0.04ms, 70.8MB)
테스트 9 〉	통과 (0.07ms, 77.3MB)
테스트 10 〉	통과 (0.12ms, 69.1MB)
테스트 11 〉	통과 (0.10ms, 65.2MB)
테스트 12 〉	통과 (0.09ms, 79.7MB)
테스트 13 〉	통과 (0.10ms, 69.7MB)
테스트 14 〉	통과 (0.15ms, 73.1MB)
테스트 15 〉	통과 (0.15ms, 71.5MB)
테스트 16 〉	통과 (0.21ms, 79.5MB)
테스트 17 〉	통과 (0.12ms, 74.8MB)
테스트 18 〉	통과 (0.22ms, 73.2MB)
테스트 19 〉	통과 (0.02ms, 73MB)
테스트 20 〉	통과 (0.02ms, 69.7MB)
 */
