//强制类型转换练习二
public class Demo09Convert {
	public static void main(String[] args){
		/*
			错误:
				1.5是double类型(占8个字节),而左侧变量是int类型(占4个字节)
			
			大萝卜不能直接放入小坑中
			解决方案:
				1.把坑变大(以前采用这种方式)
				2.把萝卜变小(现在采用这种方式: 强制类型转换)
		*/
		//int j = 1.5;		
		/*
			正确:
				1.5是double类型(占8个字节),而左侧变量是int类型(占4个字节)
				不能直接赋值给左侧的int类型的变量i
				但是对double类型的数字1.5,强制类型转换成int类型,做法就是直接砍掉小数部分,1.5变成1
				数字1是int类型,可以直接赋值给左侧的int变量i
			总结:
				小数强制转换成整数,会直接砍掉小数部分,发生损失精度
		*/
		int i = (int)1.5;		
		System.out.println(i);
	}
}