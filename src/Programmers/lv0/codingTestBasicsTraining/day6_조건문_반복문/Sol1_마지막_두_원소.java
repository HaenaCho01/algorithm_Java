package Programmers.lv0.codingTestBasicsTraining.day6_조건문_반복문;

public class Sol1_마지막_두_원소 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        for (int s1 : sol.solution(new int[]{2, 1, 6})) {
            System.out.print(s1 + " ");
        }
        System.out.println();
        for (int s2 : sol.solution(new int[]{5, 2, 1, 7, 5})) {
            System.out.print(s2  + " ");
        }
    }
}

class Solution1 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        if (num_list[num_list.length-1] > num_list[num_list.length-2]) {
            for (int i = 0; i < num_list.length; i++) {
                answer[i] = num_list[i];
            }
            answer[num_list.length] = num_list[num_list.length-1] - num_list[num_list.length-2];
        } else if (num_list[num_list.length-1] <= num_list[num_list.length-2]) {
            for (int i = 0; i < num_list.length; i++) {
                answer[i] = num_list[i];
            }
            answer[num_list.length] = num_list[num_list.length-1] * 2;
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.01ms, 73.1MB)
테스트 2 〉	통과 (0.03ms, 68.8MB)
테스트 3 〉	통과 (0.02ms, 80.2MB)
테스트 4 〉	통과 (0.02ms, 87MB)
테스트 5 〉	통과 (0.03ms, 74.3MB)
테스트 6 〉	통과 (0.02ms, 74.1MB)
테스트 7 〉	통과 (0.01ms, 76.2MB)
테스트 8 〉	통과 (0.02ms, 75.8MB)
테스트 9 〉	통과 (0.02ms, 76.6MB)
테스트 10 〉	통과 (0.01ms, 72.8MB)
테스트 11 〉	통과 (0.03ms, 82.5MB)
테스트 12 〉	통과 (0.01ms, 75.3MB)
테스트 13 〉	통과 (0.02ms, 73.2MB)
테스트 14 〉	통과 (0.02ms, 76.8MB)
테스트 15 〉	통과 (0.01ms, 74.3MB)
테스트 16 〉	통과 (0.01ms, 76.4MB)
테스트 17 〉	통과 (0.03ms, 76.4MB)
테스트 18 〉	통과 (0.02ms, 72.4MB)
테스트 19 〉	통과 (0.02ms, 78.5MB)
테스트 20 〉	통과 (0.01ms, 77.7MB)
 */
