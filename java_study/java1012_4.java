package java_study;

import java.util.Scanner;

public class java1012_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("숫자를 여러 개 입력 ");
        String a = in.nextLine();

        char[] aa = a.toCharArray();

        for(int i = 0; i < aa.length; i++) {
            System.out.println(aa[i]);
        }
    }
}
