//其它类型变量的定义
public class Demo02Var {
	public static void main(String[] args){
		//定义float变量a,并初始化
		float a = 6.6F;
		System.out.println(a);//打印变量a中的值
		
		//定义double变量b,并初始化
		double b = 8.8;
		System.out.println(b);//打印变量b中的值
		
		//定义char变量c,并初始化
		char c = 'a';
		System.out.println(c);//打印变量c中的值
		
		//定义char变量d,并初始化
		//char d = 'ab';//错误的,''中不能写2个及以上的字符
		
		//定义boolean变量e,并初始化
		boolean e = true;
		System.out.println(e);//打印变量e中的值
		
		e = false;//把false存储到变量e中,原来的true就被覆盖/替换了
		System.out.println(e);
		
		//e = 100;//错误的,数据类型不匹配,100是int数字,而e是boolean类型
	}
} 