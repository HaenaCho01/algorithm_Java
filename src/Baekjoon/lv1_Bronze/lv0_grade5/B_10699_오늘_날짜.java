package Baekjoon.lv1_Bronze.lv0_grade5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class B_10699_오늘_날짜 {
    public static void main(String[] args) {
        // 현재 날짜 구하기
        LocalDate today = LocalDate.now();
        // 포맷 정의
        DateTimeFormatter format = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        // 포맷 적용
        String formatedToday = today.format(format);
        // 결과 출력
        System.out.println(formatedToday);
    }
}
