package Programmers.lv0.codingTestBasicsTraining.day14_리스트배열;

import java.util.Arrays;

class Solution2 {
    public String[] solution(String[] names) {
        int size = (names.length%5 == 0) ? names.length/5 : names.length/5+1;
        String[] answer = new String[size];
        for (int i = 0, j = 0; i < answer.length; i++, j = j + 5) {
            answer[i] = names[j];
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 65.6MB)
테스트 2 〉	통과 (0.01ms, 74.4MB)
테스트 3 〉	통과 (0.02ms, 74.5MB)
테스트 4 〉	통과 (0.01ms, 78.1MB)
테스트 5 〉	통과 (0.02ms, 77.5MB)
테스트 6 〉	통과 (0.02ms, 75.4MB)
테스트 7 〉	통과 (0.01ms, 82.7MB)
테스트 8 〉	통과 (0.02ms, 79.7MB)
테스트 9 〉	통과 (0.02ms, 76.9MB)
테스트 10 〉	통과 (0.02ms, 75.3MB)
테스트 11 〉	통과 (0.02ms, 78.3MB)
테스트 12 〉	통과 (0.01ms, 73.4MB)
테스트 13 〉	통과 (0.02ms, 73.7MB)
테스트 14 〉	통과 (0.03ms, 76.5MB)
테스트 15 〉	통과 (0.03ms, 79MB)
테스트 16 〉	통과 (0.01ms, 77.4MB)
테스트 17 〉	통과 (0.02ms, 74.9MB)
테스트 18 〉	통과 (0.02ms, 80.2MB)
테스트 19 〉	통과 (0.02ms, 72.8MB)
테스트 20 〉	통과 (0.02ms, 73.1MB)
 */

public class Sol2_5명씩 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        System.out.println(Arrays.toString(sol.solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"})));
    }
}
