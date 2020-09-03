import java.util.Scanner;

public class day8zuoye {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入数值:");

        double num = scanner.nextDouble();

        System.out.println("小数数字 "+num+" 的绝对值是 "+getAbs(num));
    }

    public static double getAbs(double arg0){

        return arg0 < 0 ? -arg0 : arg0;
    }

}
