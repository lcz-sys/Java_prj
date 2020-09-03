/*
	%运算符: 取余数运算符
		被除数	÷ 除数 = 商(/: 取的是商)....余数(%: 取的是余数)
		
	作用:
		1.判断数字的奇偶性
			偶数: 数字%2 结果是0
			奇数: 数字%2 结果是1
			
		2.判断一个数字能否被另外一个数字整除
		
	思考:
		借助/和%,计算一个四位数字的个位,十位,百位,千位数字
		比如数字1234
			个位: 1
			十位: 2
			百位: 3
			千位: 4
*/
public class Demo12Operator {
	public static void main(String[] args){
		System.out.println(10%2);//0	说明10是一个偶数数字
		System.out.println(13%2);//1	说明13是一个奇数数字
		System.out.println(100%25);//0	说明100可以被25整除
		System.out.println(101%25);//1	说明101不可以被25整除
	}
} 