package Programmers.lv0.codingTestIntroduction.day7_문자열_조건문_수학_반복문;

public class Sol1_특정_문자_제거하기 {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != letter.charAt(0)) {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }

    public String solutionOther(String my_string, String letter) {
        return my_string.replace(letter, "");
    }

    public static void main(String[] args) {
        Sol1_특정_문자_제거하기 sol = new Sol1_특정_문자_제거하기();
        System.out.println(sol.solution("abcdef", "f"));
        System.out.println(sol.solutionOther("BCBdbe", "B"));
    }
}

/*
테스트 1 〉	통과 (0.04ms, 75.1MB)
테스트 2 〉	통과 (0.03ms, 70.6MB)
테스트 3 〉	통과 (0.05ms, 78MB)
테스트 4 〉	통과 (0.04ms, 73.2MB)
테스트 5 〉	통과 (0.03ms, 64.6MB)
테스트 6 〉	통과 (0.05ms, 76.7MB)
테스트 7 〉	통과 (0.03ms, 74.2MB)
테스트 8 〉	통과 (0.05ms, 78.9MB)
테스트 9 〉	통과 (0.03ms, 78.1MB)
테스트 10 〉	통과 (0.04ms, 78.3MB)
테스트 11 〉	통과 (0.05ms, 73.7MB)
테스트 12 〉	통과 (0.04ms, 87.7MB)
테스트 13 〉	통과 (0.04ms, 71.8MB)
테스트 14 〉	통과 (0.04ms, 77MB)
테스트 15 〉	통과 (0.04ms, 78MB)
테스트 16 〉	통과 (0.04ms, 74MB)
테스트 17 〉	통과 (0.04ms, 74.1MB)
테스트 18 〉	통과 (0.04ms, 72.7MB)
테스트 19 〉	통과 (0.06ms, 76MB)
테스트 20 〉	통과 (0.05ms, 76.1MB)
 */
