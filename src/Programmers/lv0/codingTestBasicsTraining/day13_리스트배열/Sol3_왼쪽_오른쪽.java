package Programmers.lv0.codingTestBasicsTraining.day13_리스트배열;

class Solution3 {
    public String[] solution(String[] str_list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                for (int j = 0; j < i; j++) {
                    sb.append(str_list[j]);
                }
                break;
            } else if (str_list[i].equals("r")) {
                for (int j = i + 1; j < str_list.length; j++) {
                    sb.append(str_list[j]);
                }
                break;
            }
        }
        String[] answer = new String[sb.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = String.valueOf(sb.charAt(i));
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.05ms, 74MB)
테스트 2 〉	통과 (0.03ms, 76.1MB)
테스트 3 〉	통과 (0.05ms, 75.7MB)
테스트 4 〉	통과 (0.04ms, 73.4MB)
테스트 5 〉	통과 (0.03ms, 72.8MB)
테스트 6 〉	통과 (0.02ms, 79MB)
테스트 7 〉	통과 (0.06ms, 73.8MB)
테스트 8 〉	통과 (0.04ms, 76.8MB)
테스트 9 〉	통과 (0.02ms, 71.7MB)
테스트 10 〉	통과 (0.06ms, 75MB)
테스트 11 〉	통과 (0.04ms, 74.9MB)
테스트 12 〉	통과 (0.04ms, 79MB)
테스트 13 〉	통과 (0.05ms, 71.8MB)
테스트 14 〉	통과 (0.08ms, 74.2MB)
테스트 15 〉	통과 (0.06ms, 76.1MB)
테스트 16 〉	통과 (0.04ms, 76.7MB)
테스트 17 〉	통과 (0.04ms, 71.4MB)
테스트 18 〉	통과 (0.06ms, 81.9MB)
테스트 19 〉	통과 (0.03ms, 74.9MB)
테스트 20 〉	통과 (0.04ms, 76.2MB)
 */

public class Sol3_왼쪽_오른쪽 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        for (String s : sol.solution(new String[]{"u", "u", "l", "r"})) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : sol.solution(new String[]{"l"})) {
            System.out.print(s + " ");
        }
    }
}
