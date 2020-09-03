//自动类型转换练习二
public class Demo07Convert {
	public static void main(String[] args){
		int i = 1; 
		double d = 2.5;
		/*
			错误的:
			d是double类型(占8个字节),i是int类型(占4个字节),类型不一致,会发生自动类型转换
			把int类型的i,自动类型转换为double类型,把int类型的i中的数字1变成1.0(double类型)
			double + int ==> double + double ==> double 结果是double类型(占8个字节),
			不能直接赋值给左侧的int类型变量x(占4个字节)
			
			大萝卜不能直接放入小坑中
			解决方案:
				1.把坑变大(目前采用这种方式)
				2.把萝卜变小(后面采用这种方式: 强制类型转换)
		*/
		//int x = d + i;
		
		/*
			正确的:
			d是double类型(占8个字节),i是int类型(占4个字节),类型不一致,会发生自动类型转换
			把int类型的i,自动类型转换为double类型,把int类型的i中的数字1变成1.0(double类型)
			double + int ==> double + double ==> double 结果是double类型(占8个字节),
			可以直接赋值给左侧的double类型变量x(占8个字节)			
		*/
		double x = d + i;
		
		System.out.println(x);//3.5
	}
}