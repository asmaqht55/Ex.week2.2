import java.util.Scanner;

public class calcullator {
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            System.out.println("ENTER YOUR FIRST NUMBER:");
            int number1= in.nextInt();
            System.out.println("ENTER YOUR SECEND NUMBER:");
            int number2= in.nextInt();
            System.out.println("ENTER YOUR OPERATION:");
            String opearition= in.next();
            if (opearition.equals("+")){
                System.out.println(number1+number2);
            } else if (opearition.equals("-")) {
                System.out.println(number2-number1);

            } else if (opearition.equals("*")) {
                System.out.println(number1*number2);

            } else if (opearition.equals("%")) {
                System.out.println(number1%number2);

            }

    }
}