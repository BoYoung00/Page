package java_study;

import java.util.Scanner;

public class java1012_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("숫자를 여러 개 입력 : ");
        String a = in.nextLine();

        for(int i = 0; i < a.length(); i++) {
            int num = (int)a.charAt(i) - 48;
            System.out.println("*".repeat(num));
        }

        //        char[] aa = a.toCharArray();
//
//        for(int i = 0; i < aa.length; i++) {
//            int num = (int)aa[i] - 48;
//            System.out.println("*".repeat(num));
//        }
    }
}
