package DoItAlgorithmIntroduction.chap01.part1algorithm;
// 네 값의 최솟값을 구하는 min4 메서드를 작성하세요.

public class Practice03 {
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        return min;
    }

    public static void main(String[] args) {
        System.out.println("min4(1,2,3,4) = " + min4(1, 2, 3, 4));
        System.out.println("min4(9,0,5,1) = " + min4(9, 0, 5, 1));
        System.out.println("min4(5,8,0,1) = " + min4(5, 8, 0, 1));
        System.out.println("min4(6,7,8,1) = " + min4(6, 7, 8, 1));
        System.out.println("min4(6,8,1,1) = " + min4(6, 8, 1, 1));
        System.out.println("min4(9,9,9,9) = " + min4(9, 9, 9, 9));
    }
}
