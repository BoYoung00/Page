package java_study;

import java.util.Scanner;

public class java1012_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("합계의 시작 값 ==> ");
        int a = in.nextInt();
        System.out.print("합계의 끝 값 ==> ");
        int b = in.nextInt();
        System.out.print("배수 ==> ");
        int c = in.nextInt();
        int sum = 0;
        int i=a;

        while (i <= b) {
            if (i%c==0)
                sum += i;
            i++;
        }
        System.out.printf("%d부터 %d까지의 %d배수의 합계 ==> %d", a, b, c, sum);

//        for (int i=a; a <=b; i++) {
//            if (i%c==0)
//                sum += i;
//        }
//        System.out.printf("%d부터 %d까지의 %d배수의 합계 ==> %d", a, b, c, sum);
    }
}
