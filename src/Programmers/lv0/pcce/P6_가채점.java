package Programmers.lv0.pcce;

// 디버깅 문제
public class P6_가채점 {
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
// 버그      if (our_score[i] == score_list[i]) {
            if (our_score[i] == score_list[numbers[i] - 1]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}

/*
테스트 1 〉	통과 (0.02ms, 77.6MB)
테스트 2 〉	통과 (0.02ms, 78.6MB)
테스트 3 〉	통과 (0.03ms, 76.5MB)
테스트 4 〉	통과 (0.02ms, 75.6MB)
테스트 5 〉	통과 (0.01ms, 76.8MB)
테스트 6 〉	통과 (0.03ms, 77.1MB)
테스트 7 〉	통과 (0.03ms, 73.6MB)
테스트 8 〉	통과 (0.02ms, 70.4MB)
테스트 9 〉	통과 (0.02ms, 76.4MB)
테스트 10 〉	통과 (0.03ms, 72.9MB)
테스트 11 〉	통과 (0.01ms, 76.1MB)
테스트 12 〉	통과 (0.02ms, 75.1MB)
테스트 13 〉	통과 (0.02ms, 73.5MB)
테스트 14 〉	통과 (0.03ms, 78.2MB)
테스트 15 〉	통과 (0.01ms, 78.5MB)
테스트 16 〉	통과 (0.02ms, 74.6MB)
테스트 17 〉	통과 (0.02ms, 72.3MB)
테스트 18 〉	통과 (0.03ms, 71.5MB)
테스트 19 〉	통과 (0.02ms, 76.2MB)
테스트 20 〉	통과 (0.01ms, 72.5MB)
테스트 21 〉	통과 (0.03ms, 71.3MB)
테스트 22 〉	통과 (0.02ms, 68.3MB)
테스트 23 〉	통과 (0.03ms, 77.4MB)
테스트 24 〉	통과 (0.03ms, 78.5MB)
테스트 25 〉	통과 (0.03ms, 76.7MB)
테스트 26 〉	통과 (0.03ms, 76.8MB)
테스트 27 〉	통과 (0.02ms, 75.1MB)
테스트 28 〉	통과 (0.02ms, 75.6MB)
테스트 29 〉	통과 (0.02ms, 71.6MB)
테스트 30 〉	통과 (0.02ms, 73.9MB)
테스트 31 〉	통과 (0.03ms, 88.5MB)
테스트 32 〉	통과 (0.02ms, 80.9MB)
테스트 33 〉	통과 (0.02ms, 75.2MB)
테스트 34 〉	통과 (0.01ms, 73.1MB)
테스트 35 〉	통과 (0.02ms, 75MB)
테스트 36 〉	통과 (0.02ms, 74.4MB)
테스트 37 〉	통과 (0.02ms, 78.4MB)
테스트 38 〉	통과 (0.04ms, 79.6MB)
테스트 39 〉	통과 (0.03ms, 82MB)
테스트 40 〉	통과 (0.03ms, 79MB)
테스트 41 〉	통과 (0.02ms, 75.7MB)
테스트 42 〉	통과 (0.02ms, 68.6MB)
테스트 43 〉	통과 (0.02ms, 79.2MB)
테스트 44 〉	통과 (0.01ms, 73.5MB)
테스트 45 〉	통과 (0.02ms, 77.2MB)
테스트 46 〉	통과 (0.01ms, 77.8MB)
테스트 47 〉	통과 (0.01ms, 76.3MB)
테스트 48 〉	통과 (0.01ms, 75.6MB)
테스트 49 〉	통과 (0.02ms, 72.8MB)
테스트 50 〉	통과 (0.02ms, 72MB)
 */