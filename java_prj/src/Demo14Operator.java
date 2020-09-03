//赋值运算符
public class Demo14Operator {
	public static void main(String[] args){
		//定义int变量a和b,并分别初始化
		int a = 10, b = 20;
		
		a += b;//a = a + b = 10 + 20 = 30
		
		System.out.println(a);//30
		System.out.println(b);//20
		
		//定义int变量c和d,并分别初始化
		int c = 30, d = 20;
		c %= d;// c = c % d = 30 % 20 = 10
		
		System.out.println(c);//10
		System.out.println(d);//20
	}
}