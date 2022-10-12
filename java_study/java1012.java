package java_study;

public class java1012 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1; i<=10; i++)
            sum+=i;
        System.out.printf("1~10의 합계 : %d\n", sum);

        int sum1=0;
        int j=1;
        while (j<=10) {
            sum1+=j;
            j++;
        }
        System.out.printf("1~10의 합계 : %d\n", sum1);
    }
}
