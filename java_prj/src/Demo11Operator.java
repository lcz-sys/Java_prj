//����������Ӽ��˳�
public class Demo11Operator {
	public static void main(String[] args){
		//����int����a��b,���ֱ��ʼ��
		int a = 30, b = 20;
		
		System.out.println(a + b);//30 + 20: 50
		System.out.println(a - b);//30 - 20: 10
		System.out.println(a * b);//30 * 20: 600
		//int/int ==> int
		System.out.println(a / b);//30 / 20: 1
		
		//int*double / int ==> double*double / double ==> double
		System.out.println(a*1.0 / b);//30*1.0 / 20 ==> 30.0*1.0 / 20.0 ==> 1.5
	}
}