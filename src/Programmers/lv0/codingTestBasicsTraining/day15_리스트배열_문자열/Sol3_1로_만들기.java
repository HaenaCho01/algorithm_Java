package Programmers.lv0.codingTestBasicsTraining.day15_리스트배열_문자열;

class Solution3 {
    public int solution(int[] num_list) {
        int answer = 0;
        for (int i = 0; i < num_list.length;) {
            if (num_list[i] == 1) {
                i++;
            }
            if (i == num_list.length) {
                break;
            }

            if (num_list[i] % 2 == 0) {
                num_list[i] = num_list[i] / 2;
                answer++;
            } else if (num_list[i] % 2 == 1) {
                if (num_list[i] == 1) {
                    i++;
                } else {
                    num_list[i] = (num_list[i] - 1) / 2;
                    answer++;
                }
            }

        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 72.9MB)
테스트 2 〉	통과 (0.03ms, 77.9MB)
테스트 3 〉	통과 (0.02ms, 73.8MB)
테스트 4 〉	통과 (0.02ms, 73.6MB)
테스트 5 〉	통과 (0.02ms, 79.3MB)
테스트 6 〉	통과 (0.03ms, 69.2MB)
테스트 7 〉	통과 (0.02ms, 76.5MB)
테스트 8 〉	통과 (0.03ms, 77.5MB)
테스트 9 〉	통과 (0.02ms, 73.8MB)
테스트 10 〉	통과 (0.03ms, 66.3MB)
테스트 11 〉	통과 (0.03ms, 67.8MB)
테스트 12 〉	통과 (0.03ms, 81.6MB)
테스트 13 〉	통과 (0.03ms, 75.2MB)
테스트 14 〉	통과 (0.02ms, 76.7MB)
테스트 15 〉	통과 (0.03ms, 74.8MB)
테스트 16 〉	통과 (0.02ms, 73.8MB)
테스트 17 〉	통과 (0.03ms, 73MB)
테스트 18 〉	통과 (0.03ms, 73.3MB)
테스트 19 〉	통과 (0.02ms, 69.3MB)
 */

public class Sol3_1로_만들기 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        System.out.println(sol.solution(new int[] {12, 4, 15, 1, 14}));
    }
}
