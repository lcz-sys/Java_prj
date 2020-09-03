//char和int的运算原理
public class Demo10Char {
	public static void main(String[] args){
		//定义char类型的变量ch,并初始化
		char ch = 'a';		
		System.out.println(ch);//a
		/*
			ch是char类型,数字1是int类型,类型不一致,需要进行自动类型转换
			byte/short/char 只要参加运算,都会自动类型转换为int类型
			把char类型的ch,自动类型转换成int类型
			问题:
				如何把char类型转换成int类型呢?
			解决方案:
				查看ASCII码表,'a'对应的int数字 97
				
			char + int ==> int + int ==> int 结果是int数字98
		*/
		System.out.println(ch + 1);//98
		
		/*
			ch是char类型,数字1是int类型,类型不一致,需要进行自动类型转换
			byte/short/char 只要参加运算,都会自动类型转换为int类型
			把char类型的ch,自动类型转换成int类型
			问题:
				如何把char类型转换成int类型呢?
			解决方案:
				查看ASCII码表,'a'对应的int数字 97				
			char + int ==> int + int ==> int 结果是int数字98
			
			但是最后对int类型的结果数据98进行强制类型转换成char类型
			问题:
				如何把int类型转换成char类型呢?
			解决方案:
				查看ASCII码表,数字98对应的字符 b		
		*/
		System.out.println((char)(ch + 1));//b
		
		
	}
} 