//��ֵ�����
public class Demo14Operator {
	public static void main(String[] args){
		//����int����a��b,���ֱ��ʼ��
		int a = 10, b = 20;
		
		a += b;//a = a + b = 10 + 20 = 30
		
		System.out.println(a);//30
		System.out.println(b);//20
		
		//����int����c��d,���ֱ��ʼ��
		int c = 30, d = 20;
		c %= d;// c = c % d = 30 % 20 = 10
		
		System.out.println(c);//10
		System.out.println(d);//20
	}
}