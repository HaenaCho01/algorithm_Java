package Programmers.lv0.codingTestBasicsTraining.day11_리스트배열;

class Solution3 {
    public String solution(String my_string, int[] indices) {
        String[] strings = my_string.split("");
        for (int index : indices) {
            strings[index] = null;
        }
        StringBuilder answer = new StringBuilder();
        for (String string : strings) {
            if (string != null) {
                answer.append(string);
            }
        }
        return answer.toString();
    }
}

public class Sol3_글자_지우기 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        System.out.println(sol.solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3}));
    }
}

/*
테스트 1 〉	통과 (0.16ms, 77.1MB)
테스트 2 〉	통과 (0.11ms, 68.4MB)
테스트 3 〉	통과 (0.14ms, 85.3MB)
테스트 4 〉	통과 (0.16ms, 76.5MB)
테스트 5 〉	통과 (0.21ms, 77.4MB)
테스트 6 〉	통과 (0.21ms, 78.1MB)
테스트 7 〉	통과 (0.21ms, 76.8MB)
테스트 8 〉	통과 (0.29ms, 74.8MB)
테스트 9 〉	통과 (0.19ms, 78.5MB)
테스트 10 〉	통과 (0.37ms, 74MB)
테스트 11 〉	통과 (0.24ms, 72.7MB)
테스트 12 〉	통과 (0.33ms, 74.8MB)
테스트 13 〉	통과 (0.46ms, 76.2MB)
테스트 14 〉	통과 (0.26ms, 73.7MB)
테스트 15 〉	통과 (0.42ms, 77.7MB)
테스트 16 〉	통과 (0.28ms, 77.1MB)
테스트 17 〉	통과 (0.28ms, 78MB)
테스트 18 〉	통과 (0.26ms, 73.7MB)
 */