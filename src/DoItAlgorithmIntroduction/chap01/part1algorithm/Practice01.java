package DoItAlgorithmIntroduction.chap01;
// 네 값의 최댓값을 구하는 max4 메서드를 작성하세요.

public class Practice01 {
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max;
    }

    public static void main(String[] args) {
        System.out.println("max4(1,2,3,4) = " + max4(1, 2, 3, 4));
        System.out.println("max4(9,7,5,1) = " + max4(9, 7, 5, 1));
        System.out.println("max4(5,8,3,1) = " + max4(5, 8, 3, 1));
        System.out.println("max4(6,7,8,1) = " + max4(6, 7, 8, 1));
        System.out.println("max4(6,8,8,1) = " + max4(6, 8, 8, 1));
        System.out.println("max4(9,9,9,9) = " + max4(9, 9, 9, 9));
    }
}
