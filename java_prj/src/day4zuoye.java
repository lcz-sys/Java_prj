import java.util.Scanner;

public class day4zuoye {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个整数:");
        int num1 = scanner.nextInt();

        System.out.print("请输入第二个整数:");
        int num2 = scanner.nextInt();

        System.out.print("请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):");
        int num3 = scanner.nextInt();

        String result;

        switch (num3){
            case 0:
                result = num1 + num2 + "";
                break;
            case 1:
                result = num1 - num2 + "";
                break;
            case 2:
                result = num1 * num2 + "";
                break;
            case 3:
                if(num2 == 0){
                    result = "除数不能为0";
                    break;
                }
                result = num1 / num2 + "";
                break;
            default:
                result = "参数不合法";
        }

        System.out.println("控制台输出:"+result);
    }
}
