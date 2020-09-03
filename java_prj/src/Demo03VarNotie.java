/*
	变量定义的注意事项:
		1.变量名称：在同一个大括号范围内，变量的名字不可以相同。
		2.变量赋值：定义的变量，不赋值不能使用。
*/
public class Demo03VarNotie {
	public static void main(String[] args){
		//定义int变量a,并初始化
		int a = 10;
		System.out.println(a);//10
		
		//错误: 在同一个{}范围内，变量的名字不可以相同
		//int a = 20;//从新定义一个变量a
		//System.out.println(a);//10
		
		a = 20;//给已有的变量a赋值20,原有的10将被替换
		System.out.println(a);//20
		
		//定义int变量b,未赋值
		int b;
		//System.out.println(b);//错误,目前变量b中没有值,不能使用
		b = 30;
		System.out.println(b);//30
	}
} 