package Programmers.lv1.prac_연습문제;

import java.util.*;

public class P_카드_뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // goal의 순서와 cards의 순서가 모두 일치할 경우 "Yes"를 반환하도록 선언한다.
        String answer = "Yes";
        // goal을 돌며 cards1, cards2와 비교한다.
        for (int i = 0, index1 = 0, index2 = 0; i < goal.length; i++) {
            // goal의 순서와 cards1의 순서가 일치하면 cards1의 인덱스를 ++한다.
            if (index1 < cards1.length && cards1[index1].equals(goal[i])) {
                index1++;
            } else {
                // goal의 순서와 cards2의 순서가 일치하면 cards2의 인덱스를 ++한다.
                if (index2 < cards2.length && cards2[index2].equals(goal[i])) {
                    index2++;
                    // goal의 순서와 cards의 순서가 모두 일치하지 않을 경우 "No"를 반환하고 for문을 멈춘다.
                } else {
                    answer = "No";
                    break;
                }
            }
        }
        return answer;
    }

    public String solutionOther1(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> qGoal = new LinkedList<>();
        Queue<String> qCard1 = new LinkedList<>();
        Queue<String> qCard2 = new LinkedList<>();

        for (String str : goal) {
            qGoal.offer(str);
        }

        for (String card : cards1) {
            qCard1.offer(card);
        }

        for (String card : cards2) {
            qCard2.offer(card);
        }

        while (!qGoal.isEmpty()) {
            String str = qGoal.poll();

            if (str.equals(qCard1.peek())) qCard1.poll();
            else if (str.equals(qCard2.peek())) qCard2.poll();
            else return "No";
        }

        return "Yes";
    }

    public String solutionOther2(String[] cards1, String[] cards2, String[] goal) {
        List<String> card1Ary = new ArrayList<>(Arrays.asList(cards1));
        List<String> card2Ary = new ArrayList<>(Arrays.asList(cards2));

        String answer = "Yes";
        for(String str:goal) {
            if(!card1Ary.isEmpty() && card1Ary.get(0).equals(str)) {
                card1Ary.remove(0);
            } else if(!card2Ary.isEmpty() && card2Ary.get(0).equals(str)) {
                card2Ary.remove(0);
            } else {
                answer = "No";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P_카드_뭉치 sol = new P_카드_뭉치();
        System.out.println(sol.solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
        System.out.println(sol.solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
    }
}

/*
테스트 1 〉	통과 (0.03ms, 67.8MB)
테스트 2 〉	통과 (0.02ms, 67.6MB)
테스트 3 〉	통과 (0.02ms, 73.5MB)
테스트 4 〉	통과 (0.02ms, 74.1MB)
테스트 5 〉	통과 (0.02ms, 75.2MB)
테스트 6 〉	통과 (0.02ms, 70.8MB)
테스트 7 〉	통과 (0.02ms, 72.1MB)
테스트 8 〉	통과 (0.02ms, 73.2MB)
테스트 9 〉	통과 (0.03ms, 79.7MB)
테스트 10 〉	통과 (0.02ms, 75.3MB)
테스트 11 〉	통과 (0.02ms, 74.2MB)
테스트 12 〉	통과 (0.03ms, 77.9MB)
테스트 13 〉	통과 (0.01ms, 71MB)
테스트 14 〉	통과 (0.02ms, 72.4MB)
테스트 15 〉	통과 (0.03ms, 72.1MB)
테스트 16 〉	통과 (0.02ms, 73.4MB)
테스트 17 〉	통과 (0.02ms, 72.9MB)
테스트 18 〉	통과 (0.03ms, 73.2MB)
테스트 19 〉	통과 (0.03ms, 64.3MB)
테스트 20 〉	통과 (0.01ms, 76.4MB)
테스트 21 〉	통과 (0.02ms, 76MB)
테스트 22 〉	통과 (0.03ms, 72.4MB)
테스트 23 〉	통과 (0.03ms, 74.1MB)
테스트 24 〉	통과 (0.02ms, 74.6MB)
테스트 25 〉	통과 (0.03ms, 75.7MB)
 */
