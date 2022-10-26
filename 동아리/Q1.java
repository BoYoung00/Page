package 동아리;
import java.util.Scanner; //내장패키지 일종
import java.util.StringTokenizer; //스트링을 쪼갠다
import java.util.ArrayList; //배열리스트

public class Q1 implements IQ1 {
    private ArrayList<Integer> array; //배열리스트 선언
    @Override
    public String input() {//수식을 받는 추상메서드 오버라이딩
        Scanner sc = new Scanner(System.in);
        String formula = sc.next();
        return formula;
    }

    @Override
    public int[] returnpoint (String s) { //오버라이딩
        ArrayList<Integer>number = new ArrayList<>();
        int minusnumber = 0;
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='+') {
                number.add(i);
            }
            else if(s.charAt(i)=='-')
                number.add(i);
            else if(s.charAt(i)=='*')
                number.add(i);
            else if(s.charAt(i)=='/')
                number.add(i);
        }
    }

    int[] operatorIndex = new int[array.size()];

        for (int i = 0; i < array.size(); i++) {
        operatorIndex[i] = array.get(i);
    }

        return operatorIndex;

}


    @Override
    public int Value(String s) {//연산자를 이용하여 계산하는 추상메서드 오버라이딩
        int result =0;
        StringTokenizer str = new StringTokenizer(s, "+-*/", true);
        while(str.hasMoreTokens()) {
            String operator = str.nextToken();
            if(operator.equals("*")) {
                operator = str.nextToken();
                result *=Integer.parseInt(operator);

                if(operator.equals("+")) {
                    operator = str.nextToken();
                    result +=Integer.parseInt(operator);
                }


                else if(operator.equals("-")){
                    operator= str.nextToken();
                    result -=Integer.parseInt(operator);
                }
            }
            else if (operator.equals("/")){
                operator = str.nextToken();
                result /=Integer.parseInt(operator);
                if(operator.equals("+")) {
                    operator = str.nextToken();
                    result +=Integer.parseInt(operator);
                }


                else if(operator.equals("-")){
                    operator= str.nextToken();
                    result -=Integer.parseInt(operator);
                }
            }
            else if(operator.equals("+")) {
                operator = str.nextToken();
                result +=Integer.parseInt(operator);
            }

            else if(operator.equals("-")){
                operator= str.nextToken();
                result -=Integer.parseInt(operator);
            }
            else {
                result = Integer.parseInt(operator);
            }
        }
        return result;
    }
    public static void main(String[] args) {

        Q1 cal = new Q1();

        System.out.print("수식 >>");
        String s = cal.input();
        Integer result = new Integer(cal.Value(s));
        double d = result.doubleValue();
        System.out.println("결과는 " + d);
        cal.returnpoint(s);
    }
}

