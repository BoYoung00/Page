package java_study;

import java.util.Scanner;

public class java1012_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("정수? ");
        int a = in.nextInt();

        while (a!=0) {
            int sum = 0;

            for (int i=1; i <= a; i++) {
                sum +=i;
                if (i==a)
                    System.out.printf("1~%d까지의 합 : %d\n", a, sum);
            }
            System.out.print("정수? ");
            a = in.nextInt();

            if (a == 0) {
                break;
            }
        }System.out.println("프로그램 종료");
//        while (true) {
//            System.out.print("정수? ");
//            int a = in.nextInt();
//            int sum=0;
//
//            if (a == 0) {
//                System.out.println("프로그램 종료");
//                break;
//            }
//
//            for (int i=1; i <= a; i++) {
//                sum += i;
//            }
//            System.out.printf("1~%d까지의 합 : %d\n", a, sum);
//        }


}
}
