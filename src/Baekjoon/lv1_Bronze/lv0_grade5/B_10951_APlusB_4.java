package Baekjoon.lv1_Bronze.lv0_grade5;

import java.util.ArrayList;
import java.util.Scanner;

public class B_10951_APlusB_4 {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<>();
        while (sc.hasNextInt()) { // hasNext() : boolean 타입 반환. 다음 가져올 값이 있으면 True, 없으면 False.
            int a = sc.nextInt();
            int b = sc.nextInt(); // 띄어쓰기해서 한 줄에 입력
            values.add(a+b);
        }
        sc.close();

        for (Integer value: values) {
            System.out.println(value);
        }
    }
}
