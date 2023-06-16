package Programmers.lv0.codingTestBasicsTraining.day5_조건문;

public class Sol2_등차수열의_특정한_항만_더하기 {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        boolean[] included1 = {true, false, false, true, true};
        boolean[] included2 = {false, false, false, true, false, false, false};

        System.out.println(sol.solution(3, 4, included1));
        System.out.println(sol.solution(7, 1, included2));
    }
}

class Solution2 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            if(included[i] == true) {
                if (i == 0) {
                    answer = a;
                } else {
                    answer = answer + (a + (d * i));
                }
            }
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 72.8MB)
테스트 2 〉	통과 (0.02ms, 75.5MB)
테스트 3 〉	통과 (0.02ms, 81.3MB)
테스트 4 〉	통과 (0.03ms, 75.5MB)
테스트 5 〉	통과 (0.02ms, 80.3MB)
테스트 6 〉	통과 (0.01ms, 73.8MB)
테스트 7 〉	통과 (0.02ms, 67.7MB)
테스트 8 〉	통과 (0.04ms, 75.9MB)
테스트 9 〉	통과 (0.03ms, 76.6MB)
테스트 10 〉	통과 (0.02ms, 82.3MB)
테스트 11 〉	통과 (0.02ms, 73.5MB)
테스트 12 〉	통과 (0.03ms, 74.2MB)
테스트 13 〉	통과 (0.02ms, 74.8MB)
테스트 14 〉	통과 (0.02ms, 72.4MB)
테스트 15 〉	통과 (0.03ms, 75.6MB)
테스트 16 〉	통과 (0.04ms, 76.6MB)
테스트 17 〉	통과 (0.03ms, 72.1MB)
테스트 18 〉	통과 (0.02ms, 69.5MB)
테스트 19 〉	통과 (0.02ms, 74.3MB)
테스트 20 〉	통과 (0.03ms, 80.7MB)
테스트 21 〉	통과 (0.03ms, 76.4MB)
테스트 22 〉	통과 (0.03ms, 76.8MB)
테스트 23 〉	통과 (0.03ms, 73.9MB)
테스트 24 〉	통과 (0.03ms, 77.3MB)
테스트 25 〉	통과 (0.04ms, 74.4MB)
테스트 26 〉	통과 (0.03ms, 71.9MB)
테스트 27 〉	통과 (0.02ms, 73.8MB)
테스트 28 〉	통과 (0.03ms, 74.4MB)
 */
